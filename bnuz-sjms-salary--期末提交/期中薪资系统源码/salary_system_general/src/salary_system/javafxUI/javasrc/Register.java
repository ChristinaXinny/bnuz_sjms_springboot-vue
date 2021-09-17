package salary_system.javafxUI.javasrc;

/**
 * @author ChristinaXinny
 * @create 2021-05-11 7:04 AM
 */



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;


//注册界面
public class Register extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane p = null;
        try {
            p = FXMLLoader.load(getClass().getResource("../javafxml/Register.fxml"));
        } catch (IOException ex) {
            p = new BorderPane();
            Label l = new Label("Error on FXML loading:" + ex.getMessage());
            p.getChildren().add(l);
            //Logger.getLogger(TableViewData.class.getName()).log(Level.SEVERE, null, ex);

        }
        Scene scene = new Scene(p);

        primaryStage.setTitle("Register GoGoGo!!!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
