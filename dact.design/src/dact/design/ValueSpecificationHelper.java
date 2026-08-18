package dact.design;

import dact.ValueSpecification;
import dact.LiteralString;
import dact.LiteralBoolean;
import dact.LiteralReal;
import dact.LiteralInteger;
import dact.LiteralNull;

public class ValueSpecificationHelper{
	public String readValue(ValueSpecification v) {
		return readValue(v,false);
	}
	
	public String readValue(ValueSpecification v, Boolean withType) {
	    if (v == null) {
	        return "";
	    }

	    if (v instanceof LiteralString strLit) {
	    	
	        String val = strLit.getValue();
	        String toReturn = (val != null) ? ("\"" + val + "\"") : ("\"\"");
	        if (withType) return "str " + toReturn;
	        return toReturn;
	    } else if (v instanceof LiteralInteger intLit) {
	    	String toReturn = String.valueOf(intLit.getValue());
	    	if (withType) return "int " + toReturn;
	        return toReturn;
	    } else if (v instanceof LiteralReal realLit) {
	        String toReturn = String.valueOf(realLit.getValue());
	        if (withType) return "real " + toReturn;
	        return toReturn;
	    } else if (v instanceof LiteralBoolean boolLit) {
	        String toReturn = String.valueOf(boolLit.getValue());
	        if (withType) return "bool " + toReturn;
	        return toReturn;
	    } else if (v instanceof LiteralNull) {
	        return "null";

	    }
	    
	    return "<unresolved>";
	 
	}
}