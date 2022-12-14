package ru.mirea.task8.exe2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.File;

public class TestPng extends Application {
    private static String fileName = "";

    public static void main(String[] args) {
        if(args.length > 0)
            fileName = args[0];
        if(fileName == "") {
            File f = new File(fileName);
            if(!f.exists() || f.isDirectory()) {
                System.out.println("File not exist!");
                System.out.println("Press any key to exit.");
                //System.in.read();
                System.exit(0);
            }
        }
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Image image = new Image(fileName);

        ImageView imageView = new ImageView(image);
        imageView.setX(50);
        imageView.setY(25);

        imageView.setFitHeight(500);
        imageView.setFitWidth(500);

        imageView.setPreserveRatio(true);

        Group root = new Group(imageView);
        Scene scene = new Scene(root, 601, 500);
        stage.setTitle("Image view");
        stage.setScene(scene);
        stage.show();
    }
}
