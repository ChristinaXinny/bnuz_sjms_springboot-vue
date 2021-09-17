package salary_system.db.dao.idao;

import salary_system.db.javabean.bean.Employee;
import salary_system.db.javabean.bean.cla.SalesReceipt;

import java.sql.Connection;
import java.util.List;

/**
 * @author ChristinaXinny
 * @create 2021-05-20 10:35 PM
 */
public interface ISalesReceiptDao {
    //��SalesReceipt������ӵ����ݿ���
    void insert(Connection conn, SalesReceipt salesReceipt);



    //���ָ����id��ɾ�����е�һ����¼
    void deleteById(Connection conn,int eid);


    //����ڴ��е� SalesReceipt ����ȥ�޸����ݱ���ָ���ļ�¼
    void update(Connection conn,SalesReceipt employee);



    // ���ָ����id��ѯ�õ���Ӧ�� SalesReceipt ����
    Employee getSalesReceiptById(Connection conn,int id);


    // ��ѯ���е����м�¼���ɵļ���
    List<SalesReceipt> getAll(Connection conn);


    //�������ݱ��е����ݵ���Ŀ��
    Long getCount(Connection conn);

}
