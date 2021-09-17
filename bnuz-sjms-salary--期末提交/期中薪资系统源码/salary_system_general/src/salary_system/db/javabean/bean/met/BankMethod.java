package salary_system.db.javabean.bean.met;

import salary_system.db.javabean.bean.WageCard;
import salary_system.db.javabean.ibean.IPaymentMethod;

/*
 * 银行卡支付方式实现类
 */
public class BankMethod implements IPaymentMethod {
	private String bank;//银行卡
	private double account;//应支付的工资
	
	public BankMethod(String bank, double account) {
		super();
		this.bank = bank;
		this.account = account;
	}

	public void pay(WageCard wageCard) {
		// TODO Auto-generated method stub
        System.out.println("向银行卡"+bank+"支付"+wageCard.getRealPay()+"元钱");
	}

	@Override
	public String toString() {
		return "BankMethod [bank=" + bank + ", account=" + account + "]";
	}

}
