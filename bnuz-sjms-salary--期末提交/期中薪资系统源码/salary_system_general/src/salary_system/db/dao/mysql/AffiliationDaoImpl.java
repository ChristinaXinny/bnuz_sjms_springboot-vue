package salary_system.db.dao.mysql;

import salary_system.db.dao.BaseDAO;
import salary_system.db.dao.idao.IAffiliationDao;
import salary_system.db.javabean.bean.aff.Affiliation;

import java.sql.Connection;
import java.util.List;

/**
 * @author ChristinaXinny
 * @create 2021-05-20 9:22 PM
 */
public class AffiliationDaoImpl extends BaseDAO implements IAffiliationDao {
    @Override
    public void insert(Connection conn, Affiliation affiliation) {
        String sql = "insert into affiliation(affId, name, expenses, describe )values(?,?,?,?)";
        update(conn, sql, affiliation.getId(), affiliation.getName(), affiliation.getExpenses(), affiliation.getDescribe());

    }

    @Override
    public void deleteById(Connection conn, int affId) {
        String sql = "delete from affiliation where affId = ?";
        update(conn, sql, affId);
    }

    @Override
    public void update(Connection conn, Affiliation affiliation) {
        String sql = "update affiliation set name = ?,expenses = ?, describe = ? where affId = ?";
        update(conn, sql,affiliation.getName(),affiliation.getExpenses(), affiliation.getDescribe(),affiliation.getId());

    }

    @Override
    public Affiliation getAffiliation(Connection conn, int affId) {
        String sql = "select affId,name,expenses,describe from Affiliation where affId = ?";
        Affiliation affiliation = getInstance(conn,Affiliation.class, sql,affId);
        return affiliation;
    }

    @Override
    public List<Affiliation> getAll(Connection conn) {
        String sql = "select affId,name,expenses,describe from Affiliation";
        List<Affiliation> list = getForList(conn, Affiliation.class, sql);
        return list;
    }
}
