package salary_system.test.check;

/**
 * @author ChristinaXinny
 * @create 2021-05-19 8:30 PM
 */
public class Check {
    public static boolean checkreturn(String account,String password){
        boolean checkbool = false;
        if("account".equals(account)&&"password".equals(password)){
            checkbool = true;
        }
        return checkbool;
    }

}
