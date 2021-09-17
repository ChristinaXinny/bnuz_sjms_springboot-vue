package salary_system.server.nowdatebase;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.junit.Test;
import salary_system.db.dao.mysql.EmployeeDaoImpl;
import salary_system.db.javabean.bean.Employee;
import salary_system.db.jdbc.util.JDBCUtils;

import java.sql.Connection;
import java.util.*;

/**
 * @author ChristinaXinny
 * @create 2021-05-20 12:03 AM
 */

// ��������Ǵ�ϵͳ�� �򿪷���˺� �����ݿ�����ݶ������浽����
//    �������ÿ���޸� ��Ҫ����һ�����ݿ�sql �����˷���Դ
//    ֮������趨һ�°�ÿ������ʱ�� �����ڵ����ݶ����ݿ����д��

public class NowEmployee {

    private Map<Integer, Employee> emMap = new HashMap<>();
    private EmployeeDaoImpl dao = new EmployeeDaoImpl();


    //����ģʽ ����emp�� ֻ��һ��list
    public NowEmployee() {
        Connection conn = null;
        try {
            conn = JDBCUtils.getConnection();

            List<Employee> list = dao.getAll(conn);
            list.forEach(System.out::println);

            list.forEach(employee -> {
                emMap.put(employee.getEmpId(), employee);
            });

            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            JDBCUtils.closeResource(conn, null);
        }
    }

    //MysqlxCrud

    public void addEmp(Employee em){
        emMap.put(em.getEmpId(), em);
    }

    public void removeEmpById(int empId){
        emMap.remove(empId);
    }

    public void changeEmp(Employee em){
        emMap.remove(em.getEmpId());
        emMap.put(em.getEmpId(), em);
    }

    public Employee findEmp(int EmpId){
        return emMap.get(EmpId);
    }

    public List getAll(){
        List<Employee> listt = new ArrayList<>();
        for ( int key : emMap.keySet()){
            listt.add(emMap.get(key));
        }
        return listt;
    }

    @Test
    public void test(){
        System.out.println("hhhh");
        List all = getAll();
        all.forEach(System.out::println);
    }


}
