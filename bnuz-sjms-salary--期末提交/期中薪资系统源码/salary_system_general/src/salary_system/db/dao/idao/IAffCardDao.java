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
    //将cust对象添加到数据库中
    void insert(Connection conn, AffCard affCard);



    //针对指定的emId，删除表中的一条记录
    void deleteById(Connection conn,int emId);


    //针对内存中的AffCard对象，去修改数据表中指定的记录
    void update(Connection conn, AffCard affCard);


    // 针对指定的Employee id查询得到对应的 对象
    AffCard getAffCardByEmId(Connection conn,int emId);

    // 针对指定的Aff id查询得到对应的 对象
    AffCard getAffCardByAffId(Connection conn,int affId);


    // 查询表中的所有记录构成的集合
    List<AffCard> getAll(Connection conn);


    //返回数据表中的数据的条目数
    Long getCount(Connection conn);

}
