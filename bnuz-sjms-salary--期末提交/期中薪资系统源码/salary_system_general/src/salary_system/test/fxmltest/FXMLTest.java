package salary_system.test.fxmltest;/**
 * @author ChristinaXinny
 * @create 2021-05-19 8:32 PM
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
//import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import salary_system.test.check.Check;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FXMLTest extends Application {

    private Stage stage;
    private final double MINIMUM_WINDOW_WIDTH = 400.0;
    private final double MINIMUM_WINDOW_HEIGHT = 250.0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("FXML Login Sample");
        stage.setMinWidth(MINIMUM_WINDOW_WIDTH);
        stage.setMinHeight(MINIMUM_WINDOW_HEIGHT);
        gotologin();
        stage.show();
    }

    //@Override
    public void gotologin(){
        try {
            LoginController login = (LoginController) replaceSceneContent("FXML_LOGIN.fxml");
            login.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(FXMLTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //@Override
    public void gotomain(){
        try {
            MainController main = (MainController) replaceSceneContent("FXML_MAIN.fxml");
            main.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(FXMLTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //@Override
    public void userlogin(String account,String password){
        if(Check.checkreturn(account,password)){
            gotomain();
        }
    }

    //@Override
    public void useroutmain(){
        gotologin();
    }



    //@Overide
    private Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = FXMLTest.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(FXMLTest.class.getResource(fxml));
        GridPane page;
        try {
            page = (GridPane) loader.load(in);
        } finally {
            in.close();
        }
        Scene scene = new Scene(page, 800, 600);
        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }

    //@Override
    public static void main(String[] args) {
        launch(args);
    }
}
