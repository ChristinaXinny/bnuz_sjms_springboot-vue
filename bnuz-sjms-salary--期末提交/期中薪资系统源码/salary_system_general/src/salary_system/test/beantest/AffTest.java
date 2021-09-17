package salary_system.test.beantest;

import salary_system.db.javabean.bean.aff.Affiliation;
import salary_system.db.javabean.bean.aff.BasketballAffiliation;
import salary_system.db.javabean.bean.aff.GuzhengAffiliation;

/**
 * @author ChristinaXinny
 * @create 2021-05-20 8:27 PM
 */
public class AffTest {

    public static void main(String[] args) {
        Affiliation a1 = new BasketballAffiliation();
        a1.setId(122);

        Affiliation a2 = new GuzhengAffiliation();

    }
}
