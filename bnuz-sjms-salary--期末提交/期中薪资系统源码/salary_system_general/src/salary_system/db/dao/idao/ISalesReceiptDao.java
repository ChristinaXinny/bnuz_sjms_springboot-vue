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
    //将SalesReceipt对象添加到数据库中
    void insert(Connection conn, SalesReceipt salesReceipt);



    //针对指定的id，删除表中的一条记录
    void deleteById(Connection conn,int eid);


    //针对内存中的 SalesReceipt 对象，去修改数据表中指定的记录
    void update(Connection conn,SalesReceipt employee);



    // 针对指定的id查询得到对应的 SalesReceipt 对象
    Employee getSalesReceiptById(Connection conn,int id);


    // 查询表中的所有记录构成的集合
    List<SalesReceipt> getAll(Connection conn);


    //返回数据表中的数据的条目数
    Long getCount(Connection conn);

}
