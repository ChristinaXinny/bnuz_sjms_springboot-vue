package salary_system.db.javabean.bean.met;

import salary_system.db.javabean.bean.WageCard;
import salary_system.db.javabean.ibean.IPaymentMethod;


// 自取
public class HoldMethod implements IPaymentMethod {

	public void pay(WageCard wageCard) {
		// TODO Auto-generated method stub
        System.out.println("到财务自取");
	}

	@Override
	public String toString() {
		return "HoldMethod [到财务自取]";
	}

}
