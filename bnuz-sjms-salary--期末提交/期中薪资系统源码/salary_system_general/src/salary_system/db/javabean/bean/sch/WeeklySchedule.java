package salary_system.db.javabean.bean.sch;


import salary_system.db.javabean.ibean.IPaymentSchedule;
import salary_system.db.util.DateUtil;

import java.time.LocalDate;

/*
 * 按每周周五进行支付实现类
 */
public class WeeklySchedule implements IPaymentSchedule {

	public boolean isPayDate(LocalDate date) {
		// TODO Auto-generated method stub
		return DateUtil.isFriday(date);
	}

	public LocalDate getPayPeriodStartDate(LocalDate date) {
		// TODO Auto-generated method stub
		return DateUtil.add(date, -6);
	}

	@Override
	public String toString() {
		return "WeeklySchedule [每周五支付]";
	}

}
