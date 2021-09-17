package salary_system.db.javabean.bean.aff;

import salary_system.db.javabean.bean.WageCard;
import salary_system.db.javabean.ibean.IAffiliation;

/**
 * @author ChristinaXinny
 * @create 2021-05-20 8:24 PM
 */

//¿∫«Ú…Á
public class BasketballAffiliation extends Affiliation implements IAffiliation {



    @Override
    public double calculateAffCut(WageCard wageCard, AffCard affCard) {
        return 0;
    }
}
