package salary_system.db.javabean.bean.met;


import salary_system.db.javabean.bean.WageCard;
import salary_system.db.javabean.ibean.IPaymentMethod;

/*
 * 邮寄支付工资方式实现类
 */
public class MailMethod implements IPaymentMethod {
	
	private String address;
	public MailMethod(String address) {
		super();
		this.address = address;
	}


	public void pay(WageCard wageCard) {
		// TODO Auto-generated method stub
        System.out.println("给"+address+"邮寄工资");
	}


	@Override
	public String toString() {
		return "MailMethod [address=" + address + "]";
	}

}
