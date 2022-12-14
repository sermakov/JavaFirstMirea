package ru.mirea.task8.exe3;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TestAnimation2 extends Application  {

    private PathTransition pathTransitionEllipse;
    private PathTransition pathTransitionCircle;

    private void init(Stage primaryStage) {
        Group root = new Group();
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 600, 460));

        // Ellipse path example
        Rectangle rect = new Rectangle(0, 0, 40, 40);
        rect.setArcHeight(10);
        rect.setArcWidth(10);
        rect.setFill(Color.ORANGE);
        root.getChildren().add(rect);

        Path path = createEllipsePath(200, 200, 50, 100, 45);
        root.getChildren().add(path);

        pathTransitionEllipse = new PathTransition();
        pathTransitionEllipse.setDuration(Duration.seconds(8));
        pathTransitionEllipse.setPath(path);
        pathTransitionEllipse.setNode(rect);
        pathTransitionEllipse.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransitionEllipse.setCycleCount(Timeline.INDEFINITE);
        pathTransitionEllipse.setAutoReverse(false);

        // Cirle path example

        Rectangle rect2 = new Rectangle(0, 0, 20, 20);
        rect2.setArcHeight(10);
        rect2.setArcWidth(10);
        rect2.setFill(Color.GREEN);
        root.getChildren().add(rect2);

        Path path2 = createEllipsePath(400, 200, 150, 150, 0);
        root.getChildren().add(path2);

        pathTransitionCircle = new PathTransition();
        pathTransitionCircle.setDuration(Duration.seconds(2));
        pathTransitionCircle.setPath(path2);
        pathTransitionCircle.setNode(rect2);
        pathTransitionCircle.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransitionCircle.setCycleCount(Timeline.INDEFINITE);
        pathTransitionCircle.setAutoReverse(false);
    }

    private Path createEllipsePath(double centerX, double centerY, double radiusX, double radiusY, double rotate) {
        ArcTo arcTo = new ArcTo();
        arcTo.setX(centerX - radiusX + 1); // to simulate a full 360 degree celcius circle.
        arcTo.setY(centerY - radiusY);
        arcTo.setSweepFlag(false);
        arcTo.setLargeArcFlag(true);
        arcTo.setRadiusX(radiusX);
        arcTo.setRadiusY(radiusY);
        arcTo.setXAxisRotation(rotate);

        Path path = new Path();
        path.getElements().add(new MoveTo(centerX - radiusX, centerY - radiusY));
        path.getElements().add(arcTo);
        path.getElements().add(new ClosePath());

        path.setStroke(Color.DODGERBLUE);
        path.getStrokeDashArray().setAll(5d, 5d);
        return path;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        init(primaryStage);
        primaryStage.show();
        pathTransitionEllipse.play();
        pathTransitionCircle.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
