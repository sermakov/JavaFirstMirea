package ru.mirea.task8.exe1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.Random;

public class TestShape extends Application {

        public static void main(String[] args) {
            Application.launch(args);
        }

        @Override
        public void start(Stage stage) throws Exception {
            final Random random = new Random();

            Circle2d circle1 = new Circle2d(300,300, 160, 2, Color.ORANGE, Color.LIGHTGOLDENRODYELLOW);
            Circle2d circle2 = new Circle2d(300,300, 180, 2, Color.GREEN, Color.LIGHTGREEN);
            Circle2d circle3 = new Circle2d(300,300, 170, 2, Color.GRAY, Color.LIGHTGRAY);
            Circle2d circle4 = new Circle2d(300,300, 190, 2, Color.GREEN, Color.LIGHTSEAGREEN);
            Circle2d circle5 = new Circle2d(300,300, 200, 2, Color.SADDLEBROWN, Color.LIGHTGRAY);


            Hexagon2d hexagon1 = new Hexagon2d(300,300, 140, 2, Color.BLUE, Color.LIGHTBLUE);
            Hexagon2d hexagon2 = new Hexagon2d(300,300, 150, 2, Color.CORAL, Color.LIGHTCORAL);
            Hexagon2d hexagon3 = new Hexagon2d(300,300, 130, 2, Color.VIOLET, Color.LIGHTSKYBLUE);
            Hexagon2d hexagon4 = new Hexagon2d(300,300, 110, 2, Color.TRANSPARENT, Color.LIGHTCORAL);
            Hexagon2d hexagon5 = new Hexagon2d(300,300, 120, 2, Color.PERU, Color.LIGHTCYAN);


            Square2d square1 = new Square2d(300,300, 100, 2, Color.SALMON, Color.LIGHTSALMON);
            Square2d square2 = new Square2d(300,300, 30, 2, Color.RED, Color.LIGHTPINK);
            Square2d square3 = new Square2d(300,300, 20, 2, Color.HONEYDEW, Color.LIGHTSLATEGRAY);
            Square2d square4 = new Square2d(300,300, 10, 2, Color.PLUM, Color.LIGHTPINK);
            Square2d square5 = new Square2d(300,300, 15, 2, Color.BLANCHEDALMOND, Color.LIGHTPINK);

            Triangle2d triangle1 = new Triangle2d(300,300, 80, 2, Color.LAVENDER, Color.LAVENDERBLUSH);
            Triangle2d triangle2 = new Triangle2d(300,300, 70, 2, Color.SALMON, Color.LIGHTSALMON);
            Triangle2d triangle3 = new Triangle2d(300,300, 60, 2, Color.DARKBLUE, Color.LIGHTSALMON);
            Triangle2d triangle4 = new Triangle2d(300,300, 50, 2, Color.KHAKI, Color.LIGHTSKYBLUE);
            Triangle2d triangle5 = new Triangle2d(300,300, 40, 2,
                    Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256)),
                    Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256)));

            Pane pane = new Pane();

            pane.getChildren().add(circle5.getFxShape());
            pane.getChildren().add(circle4.getFxShape());
            pane.getChildren().add(circle2.getFxShape());
            pane.getChildren().add(circle3.getFxShape());
            pane.getChildren().add(circle1.getFxShape());

            pane.getChildren().add(hexagon2.getFxShape());
            pane.getChildren().add(hexagon1.getFxShape());
            pane.getChildren().add(hexagon3.getFxShape());
            pane.getChildren().add(hexagon5.getFxShape());
            pane.getChildren().add(hexagon4.getFxShape());

            pane.getChildren().add(square1.getFxShape());

            pane.getChildren().add(triangle1.getFxShape());
            pane.getChildren().add(triangle2.getFxShape());
            pane.getChildren().add(triangle3.getFxShape());
            pane.getChildren().add(triangle4.getFxShape());
            pane.getChildren().add(triangle5.getFxShape());

            pane.getChildren().add(square2.getFxShape());
            pane.getChildren().add(square3.getFxShape());
            pane.getChildren().add(square5.getFxShape());
            pane.getChildren().add(square4.getFxShape());


            Scene scene = new Scene(pane, 600, 600, true);
            stage.setScene(scene);
            stage.setTitle("2D Example");

            stage.show();
        }
    }