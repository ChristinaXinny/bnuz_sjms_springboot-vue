package lxy_.interpreter.my_interpreter;

public class OrExpr implements IExpress {
	private IExpress leftExpr,  rightExpr ;
	public OrExpr(IExpress leftExpr, IExpress rightExpr) {
		this.leftExpr = leftExpr;
		this.rightExpr = rightExpr;
	}

	@Override
	public boolean interpret(Context context) {
		return  leftExpr.interpret(context) 
				|| rightExpr.interpret(context);
	}

}
