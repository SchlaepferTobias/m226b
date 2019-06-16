import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.ViewLoader;

import java.io.IOException;


public class App extends Application {


    private Stage primaryStage;

    public App() {
        System.out.println("App class");
    }

    /**
     * The {@link #launch} method sets up my
     * <code>Main</code> class as a JavaFX application.
     *
     * @param args
     */
    public static void main(String[] args) {
        launch(App.class, args);
    }

    /**
     * is created for the test class #AppTest
     * @return
     */
    public String greeting() {
        return "hallo";
    }

    @Override
    public void start(Stage primaryStage) throws IOException{

        primaryStage.setTitle("Hotel Self Check-In");
        ViewLoader.getInstance().loadView(primaryStage, ViewLoader.WELCOME_VIEW);
    }

}