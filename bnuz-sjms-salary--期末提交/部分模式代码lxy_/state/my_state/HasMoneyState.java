package lxy_.state.my_state;

public class HasMoneyState implements IState {
	private GumballMachine gumballMachine ;
	public HasMoneyState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertMoney(int i) {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("gm will sell you gum,please get the gum");
		gumballMachine.setState(gumballMachine.SoldState);
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getGum() {
		// TODO Auto-generated method stub

	}

}
