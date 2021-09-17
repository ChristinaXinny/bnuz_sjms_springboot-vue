package lxy_.interpreter.my_interpreter;

public class Varient implements IExpress {
	
	private String name;
	
	public Varient(String name) {
		this.name = name;
	}
	@Override
	public boolean interpret(Context context) {
		// TODO Auto-generated method stub
		return context.find(this);
	}

}
