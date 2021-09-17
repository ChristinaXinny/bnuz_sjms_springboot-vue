package salary_system.test.fxmltest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author ChristinaXinny
 * @create 2021-05-19 8:32 PM
 */
public class MainController implements Initializable {
    private FXMLTest application;

    //@Override
    public void setApp(FXMLTest application){
        this.application = application;
    }

    @FXML
    private void OUT_M(ActionEvent event) {
        application.useroutmain();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}