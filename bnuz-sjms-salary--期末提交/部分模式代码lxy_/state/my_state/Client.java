package lxy_.state.my_state;

public class Client {

	public static void main(String[] args) {
		GumballMachine gm = new GumballMachine(50);
		gm.ejectQuarter();
		gm.turnCrank();
		gm.insertMoney(25);
		gm.turnCrank();
		gm.ejectQuarter();
		gm.getGum();
	}

}
