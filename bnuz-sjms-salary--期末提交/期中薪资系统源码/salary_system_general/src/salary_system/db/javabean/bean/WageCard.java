package salary_system.db.javabean.bean;

import java.time.LocalDate;

/**
 * @author ChristinaXinny
 * @create 2021-05-19 2:57 PM
 */
/*
    PayCheck���ʿ�
    һ��Ա����Ӧһ��
    ���Բ��õ���ģʽ
 */

public class WageCard {
    private int id; //���ʿ�id
    private double grossPay; // Ӧ������
    private double cutPay; // �۳�����
    private double realPay; // ʵ������
    private LocalDate payPeriodStart;//нˮ��ʼ����ʱ��
    private LocalDate payPeriodend;//нˮ��������ʱ��





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
