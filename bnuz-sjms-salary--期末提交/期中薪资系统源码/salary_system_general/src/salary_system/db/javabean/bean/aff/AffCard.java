package salary_system.db.javabean.bean.aff;

import java.sql.Date;
import java.util.Map;

/**
 * @author ChristinaXinny
 * @create 2021-05-20 8:31 PM
 */

// 协会的卡
//    记录每次服务次数
public class AffCard {
    private int emId;
    private int affId;
    private int count;
    private Date date;

    // 调用此方法就是说参加了一次协会的活动
    public void addCount(){
        this.count++;
    }

    public AffCard(int emId, int affId) {
        this.emId = emId;
        this.affId = affId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getEmId() {
        return emId;
    }

    public void setEmId(int emId) {
        this.emId = emId;
    }

    public int getAffId() {
        return affId;
    }

    public void setAffId(int affId) {
        this.affId = affId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "AffCard{" +
                "emId=" + emId +
                ", affId=" + affId +
                ", count=" + count +
                '}';
    }
}
