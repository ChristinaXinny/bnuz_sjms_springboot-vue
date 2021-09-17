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

    //将timeCard对象添加到数据库中
    void insert(Connection conn, TimeCard timeCard);



    //针对指定的id，删除表中的一条记录
    void deleteById(Connection conn,int eid);


    //针对内存中的timeCard对象，去修改数据表中指定的记录
    void update(Connection conn,TimeCard timeCard);



    // 针对指定的id查询得到对应的 Employee 对象
    Employee getTimeCardById(Connection conn,int id);


    // 查询表中的所有记录构成的集合
    List<Employee> getAll(Connection conn);


    //返回数据表中的数据的条目数
    Long getCount(Connection conn);


}
