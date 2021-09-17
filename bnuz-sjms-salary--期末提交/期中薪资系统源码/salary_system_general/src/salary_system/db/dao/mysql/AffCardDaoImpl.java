package salary_system.db.dao.mysql;

import salary_system.db.dao.BaseDAO;
import salary_system.db.dao.idao.IAffCardDao;
import salary_system.db.javabean.bean.aff.AffCard;

import java.sql.Connection;
import java.util.List;

/**
 * @author ChristinaXinny
 * @create 2021-05-20 9:34 PM
 */

//Э�Ῠ
public class AffCardDaoImpl extends BaseDAO implements IAffCardDao {
    @Override
    public void insert(Connection conn, AffCard affCard) {
        String sql = "insert into affcard(emId,affId, count, time)values(?,?,?,?)";
        update(conn, sql, affCard.getEmId(), affCard.getAffId(), affCard.getCount(), affCard.getDate());

    }

    @Override
    public void deleteById(Connection conn, int emId) {
        String sql = "delete from affcard where emId = ?";
        update(conn, sql, emId);
    }

    @Override
    public void update(Connection conn, AffCard affCard) {
        String sql = "update affcard set affId = ?,count = ?, time = ? where emId = ?";
        update(conn, sql, affCard.getAffId(), affCard.getCount(), affCard.getDate(), affCard.getEmId());

    }

    @Override
    public AffCard getAffCardByEmId(Connection conn, int emId) {
        return null;
    }

    @Override
    public AffCard getAffCardByAffId(Connection conn, int affId) {
        return null;
    }

    @Override
    public List<AffCard> getAll(Connection conn) {
        return null;
    }

    @Override
    public Long getCount(Connection conn) {
        return null;
    }
}
