package salary_system.db.javabean.ibean;

import salary_system.db.javabean.bean.WageCard;
import salary_system.db.javabean.bean.aff.AffCard;

/*
 * 抽象会费计算，协会对象
 */
public interface IAffiliation {

	double calculateAffCut(WageCard wageCard, AffCard affCard);
}
