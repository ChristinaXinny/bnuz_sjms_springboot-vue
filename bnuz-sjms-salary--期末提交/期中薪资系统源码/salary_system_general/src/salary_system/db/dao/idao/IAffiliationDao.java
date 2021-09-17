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

//    ����Э��
    void insert(Connection conn, Affiliation affiliation);

//    ɾ��
    void deleteById(Connection conn, int affId);


//    �޸�
    void update(Connection conn, Affiliation affiliation);

//    ��ѯ
    Affiliation getAffiliation(Connection conn, int affId);

    List<Affiliation> getAll(Connection conn);



}
