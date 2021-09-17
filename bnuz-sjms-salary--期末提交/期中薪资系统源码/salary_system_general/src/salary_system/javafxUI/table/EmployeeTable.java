package salary_system.javafxUI.table;

import salary_system.server.nowdatebase.NowEmployee;

/**
 * @author ChristinaXinny
 * @create 2021-05-20 1:41 AM
 */


// 显示出来的表格的bean
public class EmployeeTable {
    private int ID;
    private String name;
    private String sex;
    private int age;
    private String address;
    private String bankCard;
    private String department;
    private String wageCard;



    public EmployeeTable(NowEmployee employee) {

        //Name = employee;
        //Sex = sex;
        //Age = age;
        //Address = address;
        //BankCard = bankCard;
        //Department = department;
        //WageCard = wageCard;
    }

    public EmployeeTable(int ID, String name, String sex, int age, String address, String bankCard, String department, String wageCard) {
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.bankCard = bankCard;
        this.department = department;
        this.wageCard = wageCard;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWageCard() {
        return wageCard;
    }

    public void setWageCard(String wageCard) {
        this.wageCard = wageCard;
    }

    @Override
    public String toString() {
        return "EmployeeTable{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", bankCard='" + bankCard + '\'' +
                ", department='" + department + '\'' +
                ", wageCard='" + wageCard + '\'' +
                '}';
    }
}
