package ru.mirea.task8.exe2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class TestPng {
    public static void main(String[] args) {
        final int xSize = 400;
        final int ySize = 280;
        final Color backgroundColor = Color.WHITE;
        final String text = "SQL Browser";
        final String version = "Product Version: 1.0";

        final Stage aboutDialog = new Stage();
        aboutDialog.initModality(Modality.WINDOW_MODAL);

        Button closeButton = new Button("Close");

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                aboutDialog.close();
            }
        });

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Image img = new Image("file:image.png");
        ImageView imgView = new ImageView(img);

        grid.add(imgView, 0, 0);

        grid.add(new Text(text), 0, 1);
        grid.add(new Text(version), 0, 2);
        grid.add(closeButton, 14, 18);

        Scene aboutDialogScene = new Scene(grid, xSize, ySize, backgroundColor);
        aboutDialog.setScene(aboutDialogScene);
        aboutDialog.show();
    }
}
