package salary_system.javafxUI.javasrc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ChristinaXinny
 * @create 2021-05-11 7:09 AM
 */

// Ö÷½çÃæ
public class Select extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane p = null;
        try {

            //NowEmployee ne = new NowEmployee();

            p = FXMLLoader.load(getClass().getResource("../javafxml/EmployeeTable.fxml"));
            
        } catch (IOException ex) {
            p = new BorderPane();
            Label l = new Label("Error on FXML loading:" + ex.getMessage());
            p.getChildren().add(l);
            //Logger.getLogger(TableViewData.class.getName()).log(Level.SEVERE, null, ex);

        }
        Scene scene = new Scene(p);

        primaryStage.setTitle("Select Demo !");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

