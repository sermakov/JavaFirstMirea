package ru.mirea.task8.exe3;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TestAnimationPlanetWithtSatellite extends Application
{
    BorderPane root = new BorderPane();
    int PlanetPathRad = 200;
    int PlanetPathX = 750;
    int PlanetPathY = 400;
    double PlanetDuration = 2;

    int PlanetRad = 20;
    int PlanetX = PlanetPathX;
    int PlanetY = PlanetPathY - PlanetPathRad;

    /*int SatellitePathRad = 50;
    int SatellitePathX = PlanetX;
    int SatellitePathY = PlanetPathY - SatellitePathRad;
    double SatelliteDuration = 0.5;

    int SatelliteRad = 4;
    int SatelliteX = SatellitePathX;
    int SatelliteY = SatellitePathY - SatellitePathRad;*/



    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage){
        Circle PlanetPath = new Circle(PlanetPathRad);
        Circle Planet = new Circle(PlanetRad);

        //Circle SatellitePath = new Circle(SatellitePathRad);
        //Circle Satellite = new Circle(SatelliteRad);


        PlanetPath.setFill(Color.WHITE);
        Planet.setFill(Color.WHITE);

        PlanetPath.setStroke(Color.GRAY);
        Planet.setStroke(Color.BLUE);

        PlanetPath.setStrokeWidth(4);
        Planet.setStrokeWidth(4);

        PlanetPath.setCenterX(PlanetPathX);
        Planet.setCenterX(PlanetX);

        PlanetPath.setCenterY(PlanetPathY);
        Planet.setCenterY(PlanetY);

        PlanetPath.setFill(Color.WHITE);
        Planet.setFill(Color.WHITE);

        /*SatellitePath.setStroke(Color.GRAY);
        Satellite.setStroke(Color.BLUE);

        SatellitePath.setStrokeWidth(4);
        Satellite.setStrokeWidth(4);

        SatellitePath.setCenterX(SatellitePathX);
        Satellite.setCenterX(SatelliteX);

        SatellitePath.setCenterY(SatellitePathY);
        Satellite.setCenterY(SatelliteY);

        PathTransition ptPlanet = new PathTransition();
        ptPlanet.setNode(Planet);
        ptPlanet.setDuration(Duration.seconds(PlanetDuration));
        ptPlanet.setPath(PlanetPath);
        ptPlanet.setDelay(Duration.seconds(1));
        ptPlanet.setCycleCount(Animation.INDEFINITE);
        ptPlanet.play();

        PathTransition ptSatellite = new PathTransition();
        ptSatellite.setNode(Satellite);
        ptSatellite.setDuration(Duration.seconds(SatelliteDuration));
        ptSatellite.setPath(SatellitePath);
        ptSatellite.setDelay(Duration.seconds(1));
        ptSatellite.setCycleCount(Animation.INDEFINITE);
        ptSatellite.play();*/

        //root.getChildren().addAll(SatellitePath, Satellite);
        root.getChildren().addAll(PlanetPath, Planet);
        Scene scene = new Scene(root, 1000, 500);
        stage.setScene(scene);
        stage.setTitle("Spinning circles");
        stage.setMaximized(true);
        stage.setFullScreen(true);
        stage.show();
    }
}
