package lxy_.state.my_state;

public class NoMoneyState implements IState {
	private GumballMachine gm;
	
	public NoMoneyState(GumballMachine gm) {
		super();
		this.gm = gm;
	}

	@Override
	public void insertMoney(int i) {
		// TODO Auto-generated method stub
		System.out.println("welcome!");
		gm.setState(gm.HasMoneyState);
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("please insert money!");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("you has not inserted money!");
	}

	@Override
	public void getGum() {
		// TODO Auto-generated method stub

	}

}
