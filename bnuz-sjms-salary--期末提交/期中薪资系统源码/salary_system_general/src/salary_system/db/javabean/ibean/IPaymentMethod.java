package salary_system.db.javabean.ibean;

import salary_system.db.javabean.bean.WageCard;

/*
 * 抽象支付薪资方式 -- 邮寄、财务自取、银行卡。。。
 */
public interface IPaymentMethod {

	void pay(WageCard wageCard);
}
