package ru.mirea.task9.exe1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;


import javax.swing.*;

public class TeamVsTeam extends Application {

    private int team1Score = 0; private int team2Score = 0;

    public static void main(String[] args) {
       launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label lblScore = new Label("Result: ");
        Label lblResult = new Label("Winner:");
        lblResult.setLayoutX(100);
        lblResult.setLayoutY(-301);
        lblResult.setPrefWidth(175);

        lblScore.setLayoutX(300);
        lblScore.setLayoutY(300);

        lblScore.setPrefWidth(175);

        Button btTeam1 = new Button("Team1");
        Button btTeam2 = new Button("Team2");
        Button btLastScore = new Button("End!");



        btTeam1.setPrefWidth(75);
        btTeam2.setPrefWidth(75);
        btLastScore.setPrefWidth(75);

        btTeam1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                ++team1Score;
                lblScore.setText(String.valueOf("Result: " + team1Score + " X " + team2Score));

                if (team1Score > team2Score) {
                    lblResult.setText(String.valueOf("Winner: " + "Team1!"));
                }
                else
                if (team1Score == team2Score) {
                    lblResult.setText(String.valueOf("Winner: " + "Draw"));
                }
                else{
                    lblResult.setText(String.valueOf("Winner: " + "Team2!"));
                    team1Score = 0; team2Score = 0;
                }
            }
        });

        btTeam2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ++team2Score;
                lblScore.setText(String.valueOf("Result: " + team1Score + " X " + team2Score));

                if (team1Score > team2Score) {
                    lblResult.setText(String.valueOf("Winner: " + "Team1!"));
                }
                else
                if (team1Score == team2Score) {
                    lblResult.setText(String.valueOf("Winner: " + "Draw"));
                }
                else{
                    lblResult.setText(String.valueOf("Winner: " + "Team2!"));
                    team1Score = 0; team2Score = 0;
                }
            }
        });

        btLastScore.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (team1Score == team2Score) {
                    lblResult.setText(String.valueOf("Winner: " + "Draw"));
                    team1Score = 0; team2Score = 0;
                    return;
                }

                if (team1Score > team2Score) {
                    lblResult.setText(String.valueOf("Winner: " + "Team1!"));
                    team1Score = 0; team2Score = 0;
                }
                else {
                    lblResult.setText(String.valueOf("Winner: " + "Team2!"));
                    team1Score = 0; team2Score = 0;
                }
            }
        });

        FlowPane root = new FlowPane(lblResult, lblScore, btLastScore, btTeam1, btTeam2);
        Scene scene = new Scene(root);

        stage.setScene(scene);

        stage.setTitle("Hello JavaFX");
        stage.setWidth(600);
        stage.setHeight(600);

        stage.show();

    }
}
