package salary_system.db.javabean.bean;

import java.time.LocalDate;

/**
 * @author ChristinaXinny
 * @create 2021-05-19 2:57 PM
 */
/*
    PayCheck工资卡
    一个员工对应一个
    可以采用单例模式
 */

public class WageCard {
    private int id; //工资卡id
    private double grossPay; // 应付工资
    private double cutPay; // 扣除工资
    private double realPay; // 实付工资
    private LocalDate payPeriodStart;//薪水起始计算时间
    private LocalDate payPeriodend;//薪水结束计算时间





    public WageCard() {
    }

    public WageCard(int id) {
        this.id = id;
    }

    public LocalDate getPayPeriodStart() {
        return payPeriodStart;
    }

    public void setPayPeriodStart(LocalDate payPeriodStart) {
        this.payPeriodStart = payPeriodStart;
    }

    public LocalDate getPayPeriodend() {
        return payPeriodend;
    }

    public void setPayPeriodend(LocalDate payPeriodend) {
        this.payPeriodend = payPeriodend;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public double getCutPay() {
        return cutPay;
    }

    public void setCutPay(double cutPay) {
        this.cutPay = cutPay;
    }

    public double getRealPay() {
        return realPay;
    }

    public void setRealPay(double realPay) {
        this.realPay = realPay;
    }

    @Override
    public String toString() {
        return "WageCard{" +
                "id=" + id +
                ", grossPay=" + grossPay +
                ", cutPay=" + cutPay +
                ", realPay=" + realPay +
                ", payPeriodStart=" + payPeriodStart +
                ", payPeriodend=" + payPeriodend +
                '}';
    }
}
