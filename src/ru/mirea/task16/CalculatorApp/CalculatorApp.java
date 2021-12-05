package ru.mirea.task16.CalculatorApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class CalculatorApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("resources/fxml/mainView.fxml"));
        primaryStage.setTitle("MVC Calculator App");
        //primaryStage.getIcons().add(new Image(getClass().getResource("/img/EdenCodingIcon.png").toExternalForm()));
        primaryStage.setScene(new Scene(root, 310, 475));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
