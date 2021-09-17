package lxy_.interpreter.my_interpreter;

public class Constant implements IExpress {
	private boolean b;

	public Constant(boolean b) {
		this.b = b;
	}

	@Override
	public boolean interpret(Context context) {
		// TODO Auto-generated method stub
		return b;
	}

}
