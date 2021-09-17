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

// 这个类存的是打开系统后 打开服务端后 把数据库的数据读出来存到这里
//    不用造成每次修改 都要进行一次数据库sql 过于浪费资源
//    之后可以设定一下啊每隔多少时间 把现在的数据对数据库进行写入

public class NowEmployee {

    private Map<Integer, Employee> emMap = new HashMap<>();
    private EmployeeDaoImpl dao = new EmployeeDaoImpl();


    //单利模式 关于emp表 只有一个list
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
