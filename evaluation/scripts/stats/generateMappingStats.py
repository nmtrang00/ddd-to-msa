import csv
import xml.etree.ElementTree as ET
import os
import re

def find_child(elem, childType):
    for c in elem.iter():
        if c.tag == childType:
            return c
        
def clean_qvto_name(name_str):
    """
    Extracts human-readable names from QVTO URI fragments 
    (e.g., 'platform:/resource/.../file.qvto#//myMapping' -> 'myMapping')
    """
    if not name_str:
        return "Unknown"
    
    if "#" in name_str:
        name_str = name_str.split("#")[-1]
    
    name_str = name_str.lstrip("/")
    return name_str if name_str else "Unknown"

def process_context(context):
    context_child = None
    for e in context.iter():
        # print(e.tag)
        if e.tag == "context" and e.attrib.get("type") != None:
            context_child = e
            break
    # print(context_child)
    # print(context_child.attrib)
    # print("-"*10)
    return context_child.attrib.get("type")

def process_result(result):
    result_child = None
    for e in result.iter():
        if e.tag == "result" and e.attrib.get("type") != None:
            # print(e.tag,e.attrib)
            result_child = e
            break
    # print(context_child)
    # print(context_child.attrib)
    # print("-"*10)
    if result_child is None:
        return ""
    return result_child.attrib.get("type")

def parse_qvto_trace(file_path):
    tree = ET.parse(file_path)
    root = tree.getroot()

    trace_records = []
    module_counts = {}
    operation_counts = {}

    for elem in root.iter():
        tag_name = elem.tag.split('}')[-1] if '}' in elem.tag else elem.tag

        if tag_name.lower() in ["tracerecord", "tracerecords"]:
            mapping_op = find_child(elem,"mappingOperation") 
        
            # print(mapping_op.attrib.get("name"))

            operation = mapping_op.attrib.get("name")
            module = mapping_op.attrib.get("module")

            context = find_child(elem,"context") 
            source_type = process_context(context)
            
            result = find_child(elem,"result")
            target_type = process_result(result)

            
            trace_records.append({
                "module": module,
                "mapping_operation": operation,
                "source_type": source_type,
                "target_type": target_type
            })

            module_counts[module] = module_counts.get(module, 0) + 1
            operation_counts[operation] = operation_counts.get(operation, 0) + 1

    return trace_records, module_counts, operation_counts


def write_summary_report(total_records, module_counts, operation_counts, report_file_path):
    """Writes the summary report to a text file and displays it in the console."""
    lines = []
    lines.append("=" * 60)
    lines.append("           QVTO TRACE SUMMARY REPORT")
    lines.append("=" * 60)
    lines.append(f"Total Trace Records: {total_records}")
    lines.append(f"Unique Modules:      {len(module_counts)}")
    lines.append(f"Unique Operations:   {len(operation_counts)}")
    lines.append("-" * 60)
    
    lines.append("\nExecutions by Module:")
    for module, count in sorted(module_counts.items(), key=lambda x: x[1], reverse=True):
        mod_str = str(module) if module is not None else "Unknown"
        lines.append(f"  - {mod_str:<25}: {count}")

    lines.append("\nExecutions by Mapping Operation:")
    for op, count in sorted(operation_counts.items(), key=lambda x: x[1], reverse=True):
        op_str = str(op) if op is not None else "Unknown"
        lines.append(f"  - {op_str:<45}: {count}")
    lines.append("=" * 60)

    report_content = "\n".join(lines)
    
    # Print to console
    print(report_content)

    # Save to file
    with open(report_file_path, "w", encoding="utf-8") as f:
        f.write(report_content)
    print(f"\n[+] Summary report saved to: {report_file_path}")

def extract_qvto_mappings(qvto_file_path):
    with open(qvto_file_path, "r", encoding="utf-8") as file:
        content = file.read()
    pattern = re.compile(
        r"mapping\s+(?:(\w+(?:::\w+)*)::)?(\w+)\s*\([^)]*\)\s*:\s*(\w+(?:::\w+)*)",
        re.MULTILINE
    )
    return {op_name: (src or "N/A", tgt) for src, op_name, tgt in pattern.findall(content)}

def export_to_csv(trace_records, csv_file_path):
    """Exports raw trace records into a CSV file."""
    fieldnames = [
        "module", 
        "mapping_operation", 
        "source_context", 
        "source_type", 
        "target_context", 
        "target_type"
    ]
    
    with open(csv_file_path, mode="w", newline="", encoding="utf-8") as csvfile:
        writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
        writer.writeheader()
        writer.writerows(trace_records)
        
    print(f"[+] Raw trace records exported to CSV: {csv_file_path}")

def count_trace_executions(trace_xml_path):
    tree = ET.parse(trace_xml_path)
    counts = {}
    for elem in tree.getroot().iter():
        tag = elem.tag.split('}')[-1]
        if tag.lower() in ["tracerecord", "tracerecords"]:
            mapping_op = find_child(elem,"mappingOperation") 
            mapping_op_name = mapping_op.attrib.get("name")
            counts[mapping_op_name] = counts.get(mapping_op_name, 0) + 1
    return counts

def generate_coverage_report(qvto_file, trace_file, output_csv):
    static_mappings = extract_qvto_mappings(qvto_file)
    trace_counts = count_trace_executions(trace_file)
    
    report = []
    print("=" * 80)
    print(f"{'Mapping Operation Name':<40} | {'Source Type':<20} | {'Exec Count':<10}")
    print("=" * 80)
    
    for op_name, (src, tgt) in static_mappings.items():
        count = trace_counts.get(op_name, 0)
        report.append({
            "mapping_operation": op_name,
            "source_type": src,
            "target_type": tgt,
            "execution_count": count,
            "is_covered": count > 0
        })
        print(f"{op_name:<40} | {src:<20} | {count:<10}")
        
    print("=" * 80)

    with open(output_csv, "w", newline="", encoding="utf-8") as f:
        writer = csv.DictWriter(f, fieldnames=["mapping_operation", "source_type", "target_type", "execution_count", "is_covered"])
        writer.writeheader()
        writer.writerows(report)


if __name__ == "__main__":
    # Update paths as needed
    modules = ["DactToLemmaData","DactToLemmaService","DactToLemmaBehavior","LemmaRefine"]
    for module in modules:
        qvto_file =f"/Users/trangnguyen/Study/MS-Thesis/msc-thesis/runtime-EclipseApplication/dact-to-lemma/transforms/{module}.qvto"
        validation_dir = "/Users/trangnguyen/Study/MS-Thesis/msc-thesis/runtime-EclipseApplication/validation/trans-correctness/phase2/"
        stats_dir = os.path.join(validation_dir,"stats")
        # trace_file = os.path.join(stats_dir,f"{module}.qvtotrace")
        trace_file = os.path.join(stats_dir,"cargo.simplified.index.qvtotrace")
        report_output = os.path.join(stats_dir,f"{module}.traceSummary.txt") # Path to save the output CSV
        report_csv_output = os.path.join(stats_dir,f"{module}.traceSummary.csv") # Path to save the output CSV
        cov_csv_output = os.path.join(stats_dir,f"{module}.coverage.csv")

        records, modules, operations = parse_qvto_trace(trace_file)
        write_summary_report(len(records), modules, operations, report_output)
        export_to_csv(records, report_csv_output)
        generate_coverage_report(qvto_file, trace_file, cov_csv_output)


# if __name__ == "__main__":
#     input_file = "/Users/trangnguyen/Study/MS-Thesis/msc-thesis/impl_new/test_new/dact-to-lemma/phase1/cargo.preprocessed.index.qvtotrace"    # Replace with your input XML path
#     output_file = "/Users/trangnguyen/Study/MS-Thesis/msc-thesis/runtime-EclipseApplication/validation/trans-correctness/phase2/stats/trace_summary.csv" # Path to save the output CSV

#     records, modules, operations = parse_trace_log(input_file)
#     print_summary_report(len(records), modules, operations)
#     export_to_csv(records, output_file)