package salary_system.db.javabean.ibean;

import java.time.LocalDate;

/*
 * 抽象出支付时间 -- 每周五、隔周周五、每月
 */
public interface IPaymentSchedule {

	boolean isPayDate(LocalDate date);
	
	LocalDate getPayPeriodStartDate(LocalDate date);
}
