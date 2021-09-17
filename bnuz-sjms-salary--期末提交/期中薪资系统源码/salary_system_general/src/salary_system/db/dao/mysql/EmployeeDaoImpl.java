package salary_system.db.dao.mysql;


import salary_system.db.dao.BaseDAO;
import salary_system.db.dao.idao.IEmployeeDao;
import salary_system.db.javabean.bean.Employee;

import java.sql.Connection;
import java.util.List;

/**
 * @author ChristinaXinny
 * @create 2021-05-19 3:19 PM
 */
public class EmployeeDaoImpl extends BaseDAO implements IEmployeeDao {

    // insert employee
    @Override
    public void insert(Connection conn, Employee employee) {
        String sql = "insert into employee(empId,name,sex, age, address, bankCard, department, wageCard)values(?,?,?,?,?,?,?,?)";
        update(conn, sql, employee.getEmpId(), employee.getName(), employee.getSex(), employee.getAge(),employee.getAddress(), employee.getBankCard(), employee.getDepartment(), employee.getWageCard());
    }

    //����idɾ�� emp
    @Override
    public void deleteById(Connection conn, int empId) {
        String sql = "delete from employee where empId = ?";
        update(conn, sql, empId);

    }

    //���� emp ��Ϣ
    @Override
    public void update(Connection conn, Employee employee) {
        String sql = "update employee set name = ?,address = ?, bankCard = ? where empId = ?";
        update(conn, sql,employee.getName(),employee.getAddress(),employee.getBankCard(),employee.getEmpId());
    }

    // ����id ��ȡ employee ��������Ϣ ���� employee
    @Override
    public Employee getEmployeeById(Connection conn, int id) {
        String sql = "select empId,name,address,bankCard from employee where empId = ?";
        Employee employee = getInstance(conn,Employee.class, sql,id);
        return employee;
    }

    // ��ȡ��ѯ���� employee
    @Override
    public List<Employee> getAll(Connection conn) {
        String sql = "select empId, name, sex, age, address, bankCard, department, wageCard from employee";
        List<Employee> list = getForList(conn, Employee.class, sql);
        return list;
    }



    // ���ز�ѯ������
    @Override
    public Long getCount(Connection conn) {
        String sql = "select count(*) from employee";
        return getValue(conn, sql);
    }
}
