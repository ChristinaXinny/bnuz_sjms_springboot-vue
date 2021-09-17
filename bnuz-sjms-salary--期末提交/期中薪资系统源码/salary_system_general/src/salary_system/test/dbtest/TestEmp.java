package salary_system.test.dbtest;


import org.junit.Test;
import salary_system.db.dao.mysql.EmployeeDaoImpl;
import salary_system.db.javabean.bean.Employee;
import salary_system.db.jdbc.util.JDBCUtils;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ChristinaXinny
 * @create 2021-05-19 4:32 PM
 */
public class TestEmp {

    private Map<Integer, Employee> emMap = new HashMap<>();
    //private List<Employee> emList = new ArrayList<>();


    //单利模式 关于emp表 只有一个list
    public TestEmp() {
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



/*
这里之后就是对empDao进行测试的类
 */

    private EmployeeDaoImpl dao = new EmployeeDaoImpl();


    @Test
    public void testInsertEmp() {
        Connection conn = null;
        try {
            conn = JDBCUtils.getConnection();
            Employee em2 = new Employee(19, "xdc","女" ,3,"黑龙江","1902030534","设计部","10398423");
            Employee em3 = new Employee(6, "wfd", "男", 23,"深圳","10010400244","开发部","19420232");
            dao.insert(conn, em2);
            //dao.insert(conn, em3);
            System.out.println("添加成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn, null);

        }
    }

    @Test
    public void testDeleteEmp() {
        Connection conn = null;
        try {
            conn = JDBCUtils.getConnection();
            dao.deleteById(conn, 2);
            System.out.println("delete success");


        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtils.closeResource(conn, null);
        }

    }


    @Test
    public void testGetAll() {
        Connection conn = null;
        try {
            conn = JDBCUtils.getConnection();

            List<Employee> list = dao.getAll(conn);
            list.forEach(System.out::println);

            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            JDBCUtils.closeResource(conn, null);

        }
    }



}