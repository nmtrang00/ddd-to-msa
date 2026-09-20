import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
import os

# 1. Load Metamodel and Instance Count CSVs
INDIR = "/Users/trangnguyen/Study/MS-Thesis/msc-thesis/runtime-EclipseApplication/validation/expressiveness/"
mm_df = pd.read_csv(os.path.join(INDIR,'metamodel_list.csv'))
element_df = pd.read_csv(os.path.join(INDIR,'element_count.csv'))

# Flag classes extending TransformationOnly (or TransformationOnly itself)
trans_only_mask = (mm_df['Class'] == 'TransformationOnly') | (
    mm_df['SuperType'].apply(lambda sts: 'TransformationOnly' in sts)
)
mm_df['Is_TransformationOnly'] = trans_only_mask
# print(mm_df)
# 3. Merge Metamodel with Instance Counts
merged = pd.merge(mm_df, element_df, left_on='Class', right_on='Model Element (EClass)', how='left')
merged['Count'] = merged['Count'].fillna(0).astype(int)
print(merged)

# 4. Statistical Categorization
total_classes = len(merged)
trans_classes = merged[merged['Is_TransformationOnly']]
input_classes = merged[~merged['Is_TransformationOnly']]
abstract_input = input_classes[input_classes['Abstract'] == True]
concrete_input = input_classes[input_classes['Abstract'] == False]

covered_concrete = concrete_input[concrete_input['Count'] > 0]
uncovered_concrete = concrete_input[concrete_input['Count'] == 0]
coverage_pct = (len(covered_concrete) / len(concrete_input)) * 100

# 5. Categorize Uncovered Concrete Elements by Functional Group
def group_uncovered(name):
    if any(k in name for k in ['Domain', 'Repository', 'Service']):
        return 'DDD Model'
    elif any(k in name for k in ['Node', 'Loop', 'Action']):
        return 'Activity Model'
    else:
        return 'Expressions & Types Core'

uncovered_concrete = uncovered_concrete.copy()
uncovered_concrete['Group'] = uncovered_concrete['Class'].apply(group_uncovered)

# 6. Print Report
print("==================================================")
print("       METAMODEL COVERAGE STATISTICS REPORT       ")
print("==================================================")
print(f"Total Metamodel Classes:              {total_classes}")
print(f"Transformation-Only Classes:          {len(trans_classes)}")
print(f"Input Model Classes:                  {len(input_classes)}")
print(f"  ├── Abstract Input Classes:         {len(abstract_input)}")
print(f"  └── Concrete Input Classes:         {len(concrete_input)}")
print(f"\nConcrete Class Coverage Statistics:")
print(f"  ├── Covered Concrete Classes:       {len(covered_concrete)}")
print(f"  ├── Uncovered Concrete Classes:     {len(uncovered_concrete)}")
print(f"  └── Coverage Percentage:            {coverage_pct:.2f}%")
print("--------------------------------------------------")

print("\n--- COVERED CONCRETE INSTANCE DISTRIBUTION ---")
print(covered_concrete['Count'].describe())

print("\n--- UNCOVERED CONCRETE ELEMENTS BY GROUP ---")
print(uncovered_concrete[['Class', 'SuperType', 'Group']].to_string(index=False))

# 7. Save Processed Summary File
merged.to_csv('complete_coverage_summary.csv', index=False)