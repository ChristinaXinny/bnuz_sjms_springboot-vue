package salary_system.db.dao.idao;

import salary_system.db.javabean.bean.Employee;
import salary_system.db.javabean.bean.aff.Affiliation;

import java.sql.Connection;
import java.util.List;

/**
 * @author ChristinaXinny
 * @create 2021-05-20 9:17 PM
 */
public interface IAffiliationDao {

//    增加协会
    void insert(Connection conn, Affiliation affiliation);

//    删除
    void deleteById(Connection conn, int affId);


//    修改
    void update(Connection conn, Affiliation affiliation);

//    查询
    Affiliation getAffiliation(Connection conn, int affId);

    List<Affiliation> getAll(Connection conn);



}
