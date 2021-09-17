package salary_system.db.javabean.bean.sch;

import salary_system.db.javabean.ibean.IPaymentSchedule;
import salary_system.db.util.DateUtil;

import java.time.LocalDate;

/*
 * 隔周周五进行支付
 */
public class BiweeklySchedule implements IPaymentSchedule {
	LocalDate firstPayableFriday = LocalDate.of(2021, 1, 4);

	public boolean isPayDate(LocalDate date) {
		// TODO Auto-generated method stub
		return DateUtil.isAfterFirday(date);
	}

	public LocalDate getPayPeriodStartDate(LocalDate date) {
		// TODO Auto-generated method stub
		return DateUtil.add(date, -13);
	}

	@Override
	public String toString() {
		return "BiweeklySchedule [隔周周五支付]";
	}

}
