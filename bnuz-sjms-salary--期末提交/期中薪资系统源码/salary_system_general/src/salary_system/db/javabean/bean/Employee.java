package salary_system.db.javabean.bean;

/**
 * @author ChristinaXinny
 * @create 2021-05-19 9:52 AM
 */

/*
员工类
 */
public class Employee {
    private int empId;
    private String name;
    private String sex;
    private int age;
    private String address;
    private String bankCard;
    private String department;
    private String wageCard;
    //private WageCard wageCard = new WageCard(); // 每一个员工有一张员工卡 不需要从外面传入

    public Employee() {
    }

    public Employee(int empId) {
        this.empId = empId;

    }

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public Employee(int empId, String name, String sex, int age) {
        this.empId = empId;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Employee(int empId, String name, String sex, int age, String address, String bankCard, String department, String wageCard) {
        this.empId = empId;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.bankCard = bankCard;
        this.department = department;
        this.wageCard = wageCard;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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
        return "Employee{" +
                "empId=" + empId +
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
