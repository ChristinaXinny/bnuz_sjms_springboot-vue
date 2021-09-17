package salary_system.db.javabean.bean.cla;


import salary_system.db.javabean.bean.WageCard;
import salary_system.db.javabean.ibean.IPaymentClassification;
import salary_system.db.util.DateUtil;

import java.util.ArrayList;
import java.util.List;


/*
 * 销售员工薪资计算
 */
public class CommissionedClassification implements IPaymentClassification {
	
	private double rate;//每笔销售单提成
	private double salary;//底薪
	private List<SalesReceipt> salesReceipt=new ArrayList<SalesReceipt>();
	
	public CommissionedClassification(double rate, double salary) {
		super();
		this.rate = rate;
		this.salary = salary;
	}

    public void addSalesReceipt(SalesReceipt sr) {
    	this.salesReceipt.add(sr);
    }

	public double calculatePay(WageCard wageCard) {
		// TODO Auto-generated method stub
		double commission=0;
		for(SalesReceipt sr:salesReceipt) {
			if(DateUtil.between(sr.getDate(), wageCard.getPayPeriodStart(), wageCard.getPayPeriodend()))
				commission+=sr.getAmount()*rate;
		}
		return commission+salary;
	}

	@Override
	public String toString() {
		return "CommissionedClassification [rate=" + rate + ", salary=" + salary + ", salesReceipt=" + salesReceipt
				+ "]";
	}

}
