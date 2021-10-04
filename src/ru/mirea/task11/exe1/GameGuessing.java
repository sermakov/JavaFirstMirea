package ru.mirea.task11.exe1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class GameGuessing extends Application {
    private int count = 0;
    private int secretNumber = (int)(Math.random() * 20);
    private int ATTEMPT_COUNT = 3;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label lbl = new Label();
        Label lblDifficulty = new Label();
        Label lblCounterInfo = new Label();
        TextField textField = new TextField();
        textField.setPrefColumnCount(11);
        Button btRestart = new Button();

        lblDifficulty.setText("Choose the game difficulty:");
        btRestart.setText("Restart");
        lblCounterInfo.setText("Attempts left: " + (ATTEMPT_COUNT - count));
        lbl.setText("Input number from 0 to 20");

        btRestart.setOnAction(event ->
            {
                count = 0;
                secretNumber = (int)(Math.random() * 20);
                textField.setText("");
                textField.setDisable(false);
                lblCounterInfo.setText("Attempts left: " + (3 - count));
                lbl.setTextFill(Color.BLACK);
                lbl.setText("Input number from 0 to 20");
            });

        textField.setOnAction(event -> {
            ++count;
            lblCounterInfo.setText("Attempts left: " + (3 - count));

            int n = 0;

            if (count == ATTEMPT_COUNT){
                lbl.setText("You loose! Envisioned number is: " + secretNumber);
                lbl.setTextFill(Color.RED);
                lblCounterInfo.setText("Game over!");
                textField.setText("");
                textField.setDisable(true);
                return;
            }

            if(textField.getText() != "")
                n = Integer.parseInt(textField.getText());
            if(n == secretNumber) {
                lbl.setText("You win!");
            } else if (n < secretNumber) {
                lbl.setText("Your number " + n + " is lower than the one envisioned");
            } else {
                lbl.setText("Your number " + n + " is greater than the one envisioned");
            }
            textField.setText("");
        });

        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                textField.setText(newValue.replaceAll("[^\\d]", ""));
            }
            int n = 0;
            if(textField.getText() != "") {
                n = Integer.parseInt(textField.getText());
                String str = 0 <= n && n <= 20 ? String.valueOf(n) : "20";
                textField.setText(str);
            }
        });

        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, lblCounterInfo, textField, lbl, btRestart);
        root.setPadding(new Insets(20, 20, 20, 20));
        Scene scene = new Scene(root, 400, 400);


        primaryStage.setScene(scene);
        primaryStage.setTitle("TextField in JavaFX");
        primaryStage.show();
    }
}
