package salary_system.db.dao.idao;


import salary_system.db.javabean.bean.Employee;

import java.sql.Connection;
import java.util.List;

/**
 * @author ChristinaXinny
 * @create 2021-05-19 3:20 PM
 */



public interface IEmployeeDao {

     //�� cust ������ӵ����ݿ���
    void insert(Connection conn, Employee employee);



     //���ָ����id��ɾ�����е�һ����¼
    void deleteById(Connection conn,int eid);


     //����ڴ��е� employee ����ȥ�޸����ݱ���ָ���ļ�¼
    void update(Connection conn,Employee employee);



    // ���ָ����id��ѯ�õ���Ӧ�� Employee ����
    Employee getEmployeeById(Connection conn,int id);


    // ��ѯ���е����м�¼���ɵļ���
    List<Employee> getAll(Connection conn);


    //�������ݱ��е����ݵ���Ŀ��
    Long getCount(Connection conn);



}
