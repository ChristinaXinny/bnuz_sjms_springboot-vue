package salary_system.javafxUI.javasrc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author ChristinaXinny
 * @create 2021-05-11 12:07 上午
 */

//登陆节面
public class Login extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane p = null;
        try {
            p = FXMLLoader.load(getClass().getResource("../javafxml/Login.fxml"));
        } catch (IOException ex) {
            p = new BorderPane();
            Label l = new Label("Error on FXML loading:" + ex.getMessage());
            p.getChildren().add(l);
            //Logger.getLogger(TableViewData.class.getName()).log(Level.SEVERE, null, ex);

        }
        Scene scene = new Scene(p);

        primaryStage.setTitle("Login Welcome!!!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}


// extends Application {
//
//
//@Override
//public void start(Stage primaryStage) {
//        Pane p = null;
//        try {
//        p = FXMLLoader.load(getClass().getResource("../javafxml/TableViewData.fxml"));
//        } catch (IOException ex) {
//        p = new BorderPane();
//        Label l = new Label("Error on FXML loading:" + ex.getMessage());
//        p.getChildren().add(l);
//        Logger.getLogger(TableViewData.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//
//        Scene scene = new Scene(p);
//
//        primaryStage.setTitle("TableView Data Selection Demo !");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//        }
//
///**
// * The main() method is ignored in correctly deployed JavaFX
// * application. main() serves only as fallback in case the
// * application can not be launched through deployment artifacts,
// * e.g., in IDEs with limited FX support. NetBeans ignores main().
// *
// * @param args the command line arguments
// */
//public static void main(String[] args) {
//        launch(args);
//        }
//        }
