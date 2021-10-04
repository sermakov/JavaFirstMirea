package ru.mirea.task11.exe3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections.*;
import javafx.stage.Stage;
import javafx.scene.text.Text.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
public class MenuEdit extends Application {
    Label l;

    public void start(Stage stage)
    {
        stage.setTitle("creating contextMenu ");

        TextArea text = new TextArea("");
        text.setFont(Font.font("Verdana", FontWeight.NORMAL, 16));

        ContextMenu contextMenu = new ContextMenu();

        MenuItem menuItem1 = new MenuItem("Enable Bold font");
        MenuItem menuItem4 = new MenuItem("Edit color black");
        MenuItem menuItem3 = new MenuItem("Edit color red");
        MenuItem menuItem2 = new MenuItem("Disable Bold font");

        contextMenu.getItems().add(menuItem1);
        contextMenu.getItems().add(menuItem2);
        contextMenu.getItems().add(menuItem3);
        contextMenu.getItems().add(menuItem4);

        TilePane tilePane = new TilePane(text);

        text.setContextMenu(contextMenu);

        Scene sc = new Scene(tilePane, 200, 200);

        menuItem1.setOnAction(actionEvent -> text.setFont(Font.font("Verdana", FontWeight.BOLD, 16)));
        menuItem2.setOnAction(actionEvent-> text.setFont(Font.font("Verdana", FontWeight.NORMAL, 16)));
        menuItem3.setOnAction(actionEvent -> text.setStyle("-fx-text-fill: red; -fx-font-size: 16px;"));
        menuItem4.setOnAction(actionEvent -> text.setStyle("-fx-text-fill: black; -fx-font-size: 16px;"));




        stage.setScene(sc);

        stage.show();
    }

    public static void main(String args[])
    {
        launch(args);
    }

}