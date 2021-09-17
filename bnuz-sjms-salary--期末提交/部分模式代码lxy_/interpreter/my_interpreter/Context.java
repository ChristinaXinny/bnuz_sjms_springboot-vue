package lxy_.interpreter.my_interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
	private Map<Varient,Boolean> varients = new HashMap<>();

	public void assign(Varient varient, boolean value) {
		varients.put(varient, value);		
	}

	public boolean find(Varient varient) {
		// TODO Auto-generated method stub
		return varients.get(varient);
	}
	

}
