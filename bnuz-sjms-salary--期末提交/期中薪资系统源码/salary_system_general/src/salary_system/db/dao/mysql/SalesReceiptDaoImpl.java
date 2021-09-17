package salary_system.db.dao.mysql;

import salary_system.db.dao.BaseDAO;
import salary_system.db.dao.idao.ISalesReceiptDao;
import salary_system.db.javabean.bean.Employee;
import salary_system.db.javabean.bean.cla.SalesReceipt;

import java.sql.Connection;
import java.util.List;

/**
 * @author ChristinaXinny
 * @create 2021-05-20 10:35 PM
 */
public class SalesReceiptDaoImpl extends BaseDAO implements ISalesReceiptDao {
    @Override
    public void insert(Connection conn, SalesReceipt salesReceipt) {
        String sql = "insert into salesreceipt(date,amount)values(?,?)";
        update(conn, sql, salesReceipt.getDate(), salesReceipt.getAmount());

    }

    @Override
    public void deleteById(Connection conn, int eid) {
        String sql = "delete from salesreceipt where empId = ?";
        update(conn, sql, eid);
    }

    @Override
    public void update(Connection conn, SalesReceipt salesReceipt) {
        String sql = "update salesreceipt set date = ? where amount = ?";
        update(conn, sql,salesReceipt.getDate(),salesReceipt.getAmount());

    }

    @Override
    public Employee getSalesReceiptById(Connection conn, int id) {
        String sql = "select empId,name,address,bankCard from employee where empId = ?";
        Employee employee = getInstance(conn,Employee.class, sql,id);
        return employee;
    }

    @Override
    public List<SalesReceipt> getAll(Connection conn) {
        //String sql = "select empId, name, sex, age, address, bankCard, department, wageCard from employee";
        //List<Employee> list = getForList(conn, Employee.class, sql);
        //return list;
        return null;
    }

    @Override
    public Long getCount(Connection conn) {
        String sql = "select count(*) from employee";
        return getValue(conn, sql);
    }
}
