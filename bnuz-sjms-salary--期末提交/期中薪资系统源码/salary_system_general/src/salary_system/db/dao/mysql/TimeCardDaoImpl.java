package salary_system.db.dao.mysql;

import salary_system.db.dao.BaseDAO;
import salary_system.db.dao.idao.ITimeCardDao;
import salary_system.db.javabean.bean.Employee;
import salary_system.db.javabean.bean.cla.TimeCard;

import java.sql.Connection;
import java.util.List;

/**
 * @author ChristinaXinny
 * @create 2021-05-20 10:32 PM
 */
public class TimeCardDaoImpl extends BaseDAO implements ITimeCardDao {
    @Override
    public void insert(Connection conn, TimeCard timeCard) {
        //String sql = "insert into salesreceipt(date,amount)values(?,?)";
        //update(conn, sql, salesReceipt.getDate(), salesReceipt.getAmount());

    }

    @Override
    public void deleteById(Connection conn, int eid) {
        String sql = "delete from salesreceipt where empId = ?";
        update(conn, sql, eid);
    }

    @Override
    public void update(Connection conn, TimeCard timeCard) {
        //String sql = "update salesreceipt set date = ? where amount = ?";
        //update(conn, sql,salesReceipt.getDate(),salesReceipt.getAmount());

    }

    @Override
    public Employee getTimeCardById(Connection conn, int id) {
        return null;
    }

    @Override
    public List<Employee> getAll(Connection conn) {
        return null;
    }

    @Override
    public Long getCount(Connection conn) {
        return null;
    }
}
