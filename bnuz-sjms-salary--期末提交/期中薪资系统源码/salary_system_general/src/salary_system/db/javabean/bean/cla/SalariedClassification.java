package salary_system.db.javabean.bean.cla;


import salary_system.db.javabean.bean.WageCard;
import salary_system.db.javabean.ibean.IPaymentClassification;

/*
 * 固定薪资支付
 */
public class SalariedClassification implements IPaymentClassification {
	
	private double salary;
	
	public SalariedClassification(double salary) {
		this.salary=salary;
	}	

	public double calculatePay(WageCard wageCard) {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public String toString() {
		return "SalariedClassification [salary=" + salary + "]";
	}
	
	

}
