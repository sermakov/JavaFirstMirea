package ru.mirea.test;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

    public class main extends Application {

        final NumberAxis xAxis = new NumberAxis(1, 31, 1);
        final NumberAxis yAxis = new NumberAxis();
        final StackedAreaChart<Number, Number> sac
                = new StackedAreaChart<Number, Number>(xAxis, yAxis);
        Label myLabel = new Label();

        @Override
        public void start(Stage stage) {
            stage.setTitle("Area Chart Sample");
            sac.setTitle("Temperature Monitoring (in Degrees C)");
            XYChart.Series<Number, Number> seriesApril
                    = new XYChart.Series<Number, Number>();
            seriesApril.setName("April");
            seriesApril.getData().add(new XYChart.Data(1, 4));
            seriesApril.getData().add(new XYChart.Data(3, 10));
            seriesApril.getData().add(new XYChart.Data(6, 15));
            seriesApril.getData().add(new XYChart.Data(9, 8));
            seriesApril.getData().add(new XYChart.Data(12, 5));
            seriesApril.getData().add(new XYChart.Data(15, 18));
            seriesApril.getData().add(new XYChart.Data(18, 15));
            seriesApril.getData().add(new XYChart.Data(21, 13));
            seriesApril.getData().add(new XYChart.Data(24, 19));
            seriesApril.getData().add(new XYChart.Data(27, 21));
            seriesApril.getData().add(new XYChart.Data(30, 21));
            XYChart.Series<Number, Number> seriesMay
                    = new XYChart.Series<Number, Number>();
            seriesMay.setName("May");
            seriesMay.getData().add(new XYChart.Data(1, 20));
            seriesMay.getData().add(new XYChart.Data(3, 15));
            seriesMay.getData().add(new XYChart.Data(6, 13));
            seriesMay.getData().add(new XYChart.Data(9, 12));
            seriesMay.getData().add(new XYChart.Data(12, 14));
            seriesMay.getData().add(new XYChart.Data(15, 18));
            seriesMay.getData().add(new XYChart.Data(18, 25));
            seriesMay.getData().add(new XYChart.Data(21, 25));
            seriesMay.getData().add(new XYChart.Data(24, 23));
            seriesMay.getData().add(new XYChart.Data(27, 26));
            seriesMay.getData().add(new XYChart.Data(31, 26));

            final Node chartPlotBackground = sac.lookup(".chart-plot-background");
            chartPlotBackground.setOnMouseEntered((MouseEvent mouseEvent) -> {
                myLabel.setVisible(true);
            });

            chartPlotBackground.setOnMouseExited((MouseEvent mouseEvent) -> {
                myLabel.setVisible(false);
            });

            chartPlotBackground.setOnMouseMoved((MouseEvent mouseEvent) -> {
                myLabel.setText("Location : X = " + mouseEvent.getSceneX() + " : Y = "+ mouseEvent.getSceneY());
                myLabel.setTranslateX(mouseEvent.getSceneX());
                myLabel.setTranslateY(mouseEvent.getSceneY());
            });

            Group root = new Group();
            root.getChildren().addAll(sac, myLabel);
            // Now the Chart shares the scene with the label
            Scene scene = new Scene(root, 800, 600);
            sac.getData().addAll(seriesApril, seriesMay);
            stage.setScene(scene);
            stage.show();

        }
    }
