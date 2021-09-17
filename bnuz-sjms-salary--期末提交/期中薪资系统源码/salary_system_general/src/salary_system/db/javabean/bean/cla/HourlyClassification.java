package salary_system.db.javabean.bean.cla;

import salary_system.db.javabean.bean.WageCard;
import salary_system.db.javabean.ibean.IPaymentClassification;
import salary_system.db.util.DateUtil;

import java.util.ArrayList;
import java.util.List;

/*
 * 小时工即按小时支付，把按小时支付计算单独拿出来实现
 */
public class HourlyClassification implements IPaymentClassification {
	
	private double hourlyRate;//每小时工钱
	private List<TimeCard> timeCards=new ArrayList<TimeCard>();//记录员工的工作时间卡
	
	public HourlyClassification(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double calculatePay(WageCard wageCard) {
		// TODO Auto-generated method stub
		double totalPay=0;
		for(TimeCard card:timeCards) {
			if(DateUtil.between(card.getDate(), wageCard.getPayPeriodStart(), wageCard.getPayPeriodend()))
				totalPay+=calculatePayForTimeCard(card);
		}
		return totalPay;
	}
	
	public void addTimeCard(TimeCard timeCard) {
		this.timeCards.add(timeCard);
	}
	
	public double calculatePayForTimeCard(TimeCard timeCard) {
		double hours=timeCard.getHours();
		if(hours>8) {
			return (8*hourlyRate+(hours-8)*hourlyRate*1.5);
		}else {
			return hours*hourlyRate;
		}
	}

	@Override
	public String toString() {
		return "HourlyClassification [hourlyRate=" + hourlyRate + ", timeCards=" + timeCards + "]";
	}

}
