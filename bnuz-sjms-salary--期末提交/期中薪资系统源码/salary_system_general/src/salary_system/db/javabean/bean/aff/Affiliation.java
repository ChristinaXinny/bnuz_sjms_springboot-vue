package salary_system.db.javabean.bean.aff;


import salary_system.db.javabean.ibean.IAffiliation;

/**
 * @author ChristinaXinny
 * @create 2021-05-20 7:55 PM
 */


public abstract class Affiliation {
    private int id;
    private String name;
    private double expenses; // 花费：每次参加协会活动就花费这个价钱
    private String describe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Affiliation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", expenses=" + expenses +
                ", describe='" + describe + '\'' +
                '}';
    }
}
