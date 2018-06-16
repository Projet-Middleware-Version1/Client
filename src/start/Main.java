package start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        initGUI(primaryStage);
    }

    private void initGUI(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../resources/views/home.fxml"));
        stage.setTitle("ESP-BANQUE");
        stage.setResizable(false);
        stage.sizeToScene();
        //stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(new Scene(root));
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
