package salary_system.db.dao.idao;

import salary_system.db.javabean.bean.Employee;
import salary_system.db.javabean.bean.cla.TimeCard;

import java.sql.Connection;
import java.util.List;

/**
 * @author ChristinaXinny
 * @create 2021-05-20 10:31 PM
 */
public interface ITimeCardDao {

    //��timeCard������ӵ����ݿ���
    void insert(Connection conn, TimeCard timeCard);



    //���ָ����id��ɾ�����е�һ����¼
    void deleteById(Connection conn,int eid);


    //����ڴ��е�timeCard����ȥ�޸����ݱ���ָ���ļ�¼
    void update(Connection conn,TimeCard timeCard);



    // ���ָ����id��ѯ�õ���Ӧ�� Employee ����
    Employee getTimeCardById(Connection conn,int id);


    // ��ѯ���е����м�¼���ɵļ���
    List<Employee> getAll(Connection conn);


    //�������ݱ��е����ݵ���Ŀ��
    Long getCount(Connection conn);


}
