package lxy_.state.my_state;
/*
 */
public class GumballMachine {
	private int gumNum = 0;
	/*
	public static int NoMoney = 0;
	public static int HasMoney = 1;
	public static int Solded = 2;
	public static int SoldOuted = 3;
	private int currentState = NoMoney;
	*/
	public  IState NoMoneyState= new NoMoneyState(this);
	public  IState HasMoneyState= new HasMoneyState(this);
	public  IState SoldState= new SoldState(this);
	private IState currentStateObj = NoMoneyState;
	

	public GumballMachine(int i) {
		this.gumNum = i;		
		if (i>0) {
			//currentState = NoMoney;
			currentStateObj = NoMoneyState;
		}
		// TODO Auto-generated constructor stub
	}

	public void insertMoney(int i) {
		currentStateObj.insertMoney(i);
	}

	public void turnCrank() {
		currentStateObj.turnCrank();
		
	}

	public void ejectQuarter() {
		
	}

	public void getGum() {
		// TODO Auto-generated method stub
		
	}

	public void setState(IState state) {
		// TODO Auto-generated method stub
		currentStateObj = state;
	}

}
