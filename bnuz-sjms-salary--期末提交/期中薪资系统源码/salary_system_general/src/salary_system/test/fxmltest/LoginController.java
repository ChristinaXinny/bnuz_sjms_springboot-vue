package salary_system.test.fxmltest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author ChristinaXinny
 * @create 2021-05-19 8:31 PM
 */
public class LoginController implements Initializable {
    @FXML
    private Text account;
    @FXML private PasswordField password;
    private FXMLTest application;


    public void setApp(FXMLTest application){
        this.application = application;
    }
    @FXML
    public void LOGIN_M(ActionEvent event) {
        application.userlogin(account.getText(), password.getText());
    }

    @FXML
    private void CLEAR_M(ActionEvent event) {
        account.setText(null);
        password.setText(null);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}