package salary_system.db.dao.idao;

import salary_system.db.javabean.bean.Employee;
import salary_system.db.javabean.bean.aff.AffCard;
import salary_system.db.javabean.bean.aff.Affiliation;

import java.sql.Connection;
import java.util.List;

/**
 * @author ChristinaXinny
 * @create 2021-05-20 9:33 PM
 */
public interface IAffCardDao {
    //��cust������ӵ����ݿ���
    void insert(Connection conn, AffCard affCard);



    //���ָ����emId��ɾ�����е�һ����¼
    void deleteById(Connection conn,int emId);


    //����ڴ��е�AffCard����ȥ�޸����ݱ���ָ���ļ�¼
    void update(Connection conn, AffCard affCard);


    // ���ָ����Employee id��ѯ�õ���Ӧ�� ����
    AffCard getAffCardByEmId(Connection conn,int emId);

    // ���ָ����Aff id��ѯ�õ���Ӧ�� ����
    AffCard getAffCardByAffId(Connection conn,int affId);


    // ��ѯ���е����м�¼���ɵļ���
    List<AffCard> getAll(Connection conn);


    //�������ݱ��е����ݵ���Ŀ��
    Long getCount(Connection conn);

}
