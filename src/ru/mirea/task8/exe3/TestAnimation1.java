package ru.mirea.task8.exe3;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TestAnimation1 extends Application {

    BorderPane root = new BorderPane();
    int BigCircRad = 200;
    int BigCircX = 750;
    int BigCircY = 400;
    double duration = 1;

    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage){
        Circle cir1 = new Circle(BigCircRad);
        Circle cir2 = new Circle(BigCircRad/10);

        cir1.setFill(Color.WHITE);
        cir2.setFill(Color.WHITE);

        cir1.setStroke(Color.BLUE);
        cir2.setStroke(Color.BLUE);

        cir1.setStrokeWidth(4);
        cir2.setStrokeWidth(4);

        cir1.setCenterX(BigCircX);
        cir2.setCenterX(BigCircX);

        cir1.setCenterY(BigCircY);
        cir2.setCenterY(BigCircY-BigCircRad);

        PathTransition pt = new PathTransition();
        pt.setNode(cir2);
        pt.setDuration(Duration.seconds(duration));
        pt.setPath(cir1);
        pt.setDelay(Duration.seconds(1));
        pt.setCycleCount(Animation.INDEFINITE);
        pt.play();

        root.getChildren().addAll(cir1, cir2);
        Scene scene = new Scene(root, 1000, 500);
        stage.setScene(scene);
        stage.setTitle("Spinning circles");
        stage.setMaximized(true);
        stage.setFullScreen(true);
        stage.show();
    }
}
