package ru.mirea.task11.exe2;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import org.w3c.dom.css.Rect;

import java.awt.*;

public class ScreenPosition extends Application {
    Path path;
    Label lblInfo;
    javafx.scene.shape.Rectangle rectCenter;
    javafx.scene.shape.Rectangle rectEast;
    javafx.scene.shape.Rectangle rectWest;
    javafx.scene.shape.Rectangle rectNorth;
    javafx.scene.shape.Rectangle rectSouth;

    @Override
    public void start(Stage primaryStage) throws Exception {
        int sizeX = 500;
        int sizeY = 320;

        Color borderColor = Color.TRANSPARENT;
        Color fillColor = Color.GREEN;
        int strokeWidth = 2;

        Group root = new Group();
        Scene scene = new Scene(root, sizeX, sizeY);
        rectCenter = new Rectangle( 100,120, 400,100);
        rectCenter.setStroke(borderColor);
        rectCenter.setStrokeWidth(strokeWidth);
        rectCenter.setFill(fillColor);


        borderColor = Color.YELLOW;
        fillColor = Color.LIGHTYELLOW;
        rectEast = new Rectangle(500, 20, 100, 300);
        rectEast.setStroke(borderColor); // цвет контура
        rectEast.setStrokeWidth(strokeWidth); // Контур, толщина 5
        rectEast.setFill(fillColor); // Заливка - прозрачная
        //rectEast.getTransforms().add(new Rotate(-30, baseX, baseY));

        borderColor = Color.BLACK;
        fillColor = Color.GRAY;

        rectWest = new Rectangle(0, 20, 100, 300);
        rectWest.setStroke(borderColor); // цвет контура
        rectWest.setStrokeWidth(strokeWidth); // Контур, толщина 5
        rectWest.setFill(fillColor); // Заливка - прозрачная
        //rectWest.getTransforms().add(new Rotate(-30, baseX, baseY));

        borderColor = Color.BLUE;
        fillColor = Color.LIGHTBLUE;

        rectNorth = new Rectangle(100,20, 400,100);
        rectNorth.setStroke(borderColor); // цвет контура
        rectNorth.setStrokeWidth(strokeWidth); // Контур, толщина 5
        rectNorth.setFill(fillColor); // Заливка - прозрачная
        //rectNorth.getTransforms().add(new Rotate(-30, baseX, baseY));

        borderColor = Color.RED;
        fillColor = Color.LIGHTSALMON;

        rectSouth = new Rectangle(100, 220, 400, 100);

        rectSouth.setStroke(borderColor);
        rectSouth.setStrokeWidth(strokeWidth);
        rectSouth.setFill(fillColor);

        lblInfo = new Label("X: Y:");
        rectCenter.setOnMouseMoved(mouseHandler);
        rectWest.setOnMouseMoved(mouseHandler);
        rectEast.setOnMouseMoved((mouseHandler));
        rectNorth.setOnMouseMoved((mouseHandler));
        rectSouth.setOnMouseMoved((mouseHandler));

        root.getChildren().addAll(rectNorth, rectEast, rectSouth, rectWest, rectCenter);
        root.getChildren().add(lblInfo);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    EventHandler<MouseEvent> mouseHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent mouseEvent) {
            if(mouseEvent.getTarget() == rectCenter)
                lblInfo.setText("X: " + mouseEvent.getSceneX() + " Y: " + mouseEvent.getSceneY() + " Center");
            if(mouseEvent.getTarget() == rectEast)
                lblInfo.setText("X: " + mouseEvent.getSceneX() + " Y: " + mouseEvent.getSceneY() + " East");
            if(mouseEvent.getTarget() == rectWest)
                lblInfo.setText("X: " + mouseEvent.getSceneX() + " Y: " + mouseEvent.getSceneY() + " West");
            if(mouseEvent.getTarget() == rectNorth)
                lblInfo.setText("X: " + mouseEvent.getSceneX() + " Y: " + mouseEvent.getSceneY() + " North");
            if(mouseEvent.getTarget() == rectSouth)
                lblInfo.setText("X: " + mouseEvent.getSceneX() + " Y: " + mouseEvent.getSceneY() + " South");


            /*System.out.println(mouseEvent.getEventType() + "\n"
                    + "X : Y - " + mouseEvent.getX() + " : " + mouseEvent.getY() + "\n"
                    + "SceneX : SceneY - " + mouseEvent.getSceneX() + " : " + mouseEvent.getSceneY() + "\n"
                    + "ScreenX : ScreenY - " + mouseEvent.getScreenX() + " : " + mouseEvent.getScreenY());

             */
        }
    };

    public static void main(String[] args) {
        launch(args);
    }
}
