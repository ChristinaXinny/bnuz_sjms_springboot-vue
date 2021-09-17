package salary_system.db.javabean.ibean;

import salary_system.db.javabean.bean.WageCard;


/*
 * 抽象出支付策略类 -- 员工类型 ： 销售、小时、月薪
 */


public interface IPaymentClassification {//

	double calculatePay(WageCard wageCard);
}
