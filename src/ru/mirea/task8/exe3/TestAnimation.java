package ru.mirea.task8.exe3;

import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;
import ru.mirea.task8.exe1.Circle2d;

import java.util.List;
import java.util.concurrent.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class TestAnimation extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }
/*
    @Override
    public void start(Stage stage) throws Exception {
        Triangle2d triangle = new Triangle2d(300,300, 80, 2, Color.SALMON, Color.LIGHTSALMON);
        Polygon triangleFx = (Polygon) triangle.getFxShape();

        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.seconds(3));
        rotateTransition.setAxis(Rotate.Z_AXIS);
        System.out.println(rotateTransition.getAxis());
        rotateTransition.setNode(triangleFx);
        rotateTransition.setByAngle(360);
        //rotateTransition.setRate(10);
        rotateTransition.setCycleCount(100);
        rotateTransition.setAutoReverse(false);
        rotateTransition.play();

        Group root = new Group(triangleFx);
        Scene scene = new Scene(root, 600, 600);

        stage.setScene(scene);
        stage.setTitle("Animation");

        stage.show();
    }
    */
    /*
@Override
public void start(Stage stage) {
    //Drawing a Circle
    Circle circle = new Circle();

    //Setting the position of the circle
    circle.setCenterX(300.0f);
    circle.setCenterY(135.0f);

    //Setting the radius of the circle
    circle.setRadius(25.0f);

    //Setting the color of the circle
    circle.setFill(Color.BROWN);

    //Setting the stroke width of the circle
    circle.setStrokeWidth(20);

    //Instantiating the path class
    Path path = new Path();

    //Creating the MoveTo path element
    MoveTo moveTo = new MoveTo(100, 150);

    //Creating the Cubic curve path element
    CubicCurveTo cubicCurveTo = new CubicCurveTo(400, 40, 175, 250, 500, 150);

    //Adding the path elements to Observable list of the Path class
    path.getElements().add(moveTo);
    path.getElements().add(cubicCurveTo);

    //Creating a path transition
    PathTransition pathTransition = new PathTransition();

    //Setting the duration of the path transition
    pathTransition.setDuration(Duration.millis(1000));

    //Setting the node for the transition
    pathTransition.setNode(circle);

    //Setting the path
    pathTransition.setPath(path);

    //Setting the orientation of the path
    pathTransition.setOrientation(PathTransition.OrientationType.
            ORTHOGONAL_TO_TANGENT);

    //Setting the cycle count for the transition
    pathTransition.setCycleCount(50);

    //Setting auto reverse value to false
    pathTransition.setAutoReverse(false);

    //Playing the animation
    pathTransition.play();

    //Creating a Group object
    Group root = new Group(circle);

    //Creating a scene object
    Scene scene = new Scene(root, 600, 300);

    //Setting title to the Stage
    stage.setTitle("Path transition example");

    //Adding scene to the stage
    stage.setScene(scene);

    //Displaying the contents of the stage
    stage.show();
    }

     */

    @Override
    public void start(Stage stage) {
        //Drawing a Circle
        Circle circle = new Circle();

        //Setting the position of the circle
        circle.setCenterX(300.0f);
        circle.setCenterY(135.0f);

        //Setting the radius of the circle
        circle.setRadius(25.0f);

        //Setting the color of the circle
        circle.setFill(Color.BROWN);

        //Setting the stroke width of the circle
        circle.setStrokeWidth(20);

        //Creating a Path
        Path path = new Path();

        //Moving to the starting point
        //MoveTo moveTo = new MoveTo(108, 71);
        //Creating 1st line
        //LineTo line1 = new LineTo(321, 161);
        //Creating 2nd line
        //LineTo line2 = new LineTo(126,232);
        //Creating 3rd line
        //LineTo line3 = new LineTo(232,52);
        //Creating 4th line
        //LineTo line4 = new LineTo(269, 250);
        //Creating 5th line
        //LineTo line5 = new LineTo(108, 71);

        MoveTo moveTo = new MoveTo();
        moveTo.setX(300.0);
        moveTo.setY(300.0);

        ArcTo arcTo = new ArcTo();
        arcTo.setX(300.0);
        arcTo.setY(300.0);
        arcTo.setRadiusX(100.0);
        arcTo.setRadiusY(100.0);
        arcTo.setXAxisRotation(270);
        arcTo.setLargeArcFlag(true);
        path.getElements().add(moveTo);
        path.getElements().add(arcTo);
        ArcTo arcTo2 = new ArcTo();
        arcTo.setX(100.0);
        arcTo.setY(300.0);
        arcTo.setRadiusX(100.0);
        arcTo.setRadiusY(100.0);
        arcTo.setXAxisRotation(270);
        arcTo.setLargeArcFlag(true);
        path.getElements().add(moveTo);
        path.getElements().add(arcTo);
        path.getElements().add(arcTo2);

        //Adding all the elements to the path

        //path.getElements().addAll(line1, line2, line3, line4, line5);

        //Creating the path transition
        PathTransition pathTransition = new PathTransition();

        //Setting the duration of the transition
        pathTransition.setDuration(Duration.millis(1000));

        //Setting the node for the transition
        pathTransition.setNode(circle);

        //Setting the path for the transition
        pathTransition.setPath(path);

        //Setting the orientation of the path
        pathTransition.setOrientation(
                PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);

        //Setting the cycle count for the transition
        pathTransition.setCycleCount(50);

        //Setting auto reverse value to true
        pathTransition.setAutoReverse(false);

        //Playing the animation
        pathTransition.play();

        //Creating a Group object
        Group root = new Group(circle);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 600);

        //Setting title to the Stage
        stage.setTitle("Path transition example");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
}