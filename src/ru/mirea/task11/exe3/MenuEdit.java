package ru.mirea.task11.exe3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.text.*;
public class MenuEdit extends Application {
    Label l;

    public void start(Stage stage)
    {
        stage.setTitle("Creating contextMenu ");

        TextArea text = new TextArea("");
        text.setFont(Font.font("Verdana", FontWeight.NORMAL, 16));

        ContextMenu contextMenu = new ContextMenu();

        MenuItem enableBold = new MenuItem("Enable Bold font");
        MenuItem toRedColor = new MenuItem("Edit color black");
        MenuItem toBlackColor = new MenuItem("Edit color red");
        MenuItem disableBold = new MenuItem("Disable Bold font");

        contextMenu.getItems().add(enableBold);
        contextMenu.getItems().add(disableBold);
        contextMenu.getItems().add(toBlackColor);
        contextMenu.getItems().add(toRedColor);

        TilePane tilePane = new TilePane(text);

        text.setContextMenu(contextMenu);

        Scene sc = new Scene(tilePane, 200, 200);

        enableBold.setOnAction(actionEvent -> text.setStyle("-fx-font-weight: bold"));//text.setFont(Font.font("Verdana", FontWeight.BOLD, 16)));
        disableBold.setOnAction(actionEvent-> text.setStyle("-fx-font-weight: regular"));//text.setFont(Font.font("Verdana", FontWeight.NORMAL, 16)));
        toBlackColor.setOnAction(actionEvent -> text.setStyle("-fx-text-fill: red; -fx-font-size: 16px;"));
        toRedColor.setOnAction(actionEvent -> text.setStyle("-fx-text-fill: black; -fx-font-size: 16px;"));




        stage.setScene(sc);

        stage.show();
    }

    public static void main(String args[])
    {
        launch(args);
    }

}