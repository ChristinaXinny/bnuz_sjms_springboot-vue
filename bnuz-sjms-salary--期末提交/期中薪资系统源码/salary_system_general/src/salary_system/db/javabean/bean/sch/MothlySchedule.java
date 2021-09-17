package salary_system.db.javabean.bean.sch;


import salary_system.db.javabean.ibean.IPaymentSchedule;
import salary_system.db.util.DateUtil;

import java.time.LocalDate;

/*
 * 按月进行支付
 */
public class MothlySchedule implements IPaymentSchedule {

	public boolean isPayDate(LocalDate date) {
		// TODO Auto-generated method stub
		return DateUtil.isLastDayOfMonth(date);
	}

	public LocalDate getPayPeriodStartDate(LocalDate date) {
		// TODO Auto-generated method stub
		return DateUtil.getFirstDay(date);
	}

	@Override
	public String toString() {
		return "MothlySchedule [月底支付]";
	}

}
