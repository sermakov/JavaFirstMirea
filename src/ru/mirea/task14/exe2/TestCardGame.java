package ru.mirea.task14.exe2;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.LinkedList;
import java.util.Queue;

public class TestCardGame extends Application {
    private final static int sizeOfDeck = 10;
    private Queue<Card> deck1 = new LinkedList<Card>();
    private Queue<Card> deck2 = new LinkedList<Card>();
    private Queue<Card> container = new LinkedList<Card>();
    private int roundsCounter = 0;

    public static void main(String[] args) {
        launch();
    }

    public void setDecks(Deck deck, Deck d1, Deck d2){
        deck.initDeck();
        deck.randomize();
        d1.copy(deck,0, sizeOfDeck/2);
        d2.copy(deck, sizeOfDeck/2, sizeOfDeck);
        for (int i = 0; i < sizeOfDeck / 2; ++i){
            Card card = new Card(d1.get(i));
            deck1.add(card);
        }

        for (int i = sizeOfDeck / 2; i < sizeOfDeck; ++i){
            Card card = new Card(d2.get(i - sizeOfDeck / 2));
            deck2.add(card);
        }
    }

    public void popAll(Queue<Card> into, Queue<Card> out){
        while (!out.isEmpty()){
            Card card = out.poll();
            into.add(card);
        }
    }

    public String deckToString(Queue<Card> deck, Queue<Card> container){
        String result = new String("");
        while (!deck.isEmpty()){
            Card card = deck.poll();
            container.add(card);
            result += card.getD() + " ";
        }

        popAll(deck, container);
        return result;
    }

    @Override
    public void start(Stage stage) throws Exception {
        Deck deck = new Deck(sizeOfDeck);
        Deck d1 = new Deck(sizeOfDeck/2);
        Deck d2 = new Deck(sizeOfDeck/2);
        setDecks(deck, d1, d2);

        Button btStart = new Button();
        btStart.setText("Start");

        final StackPane root = new StackPane();
        AnchorPane editorRoot = new AnchorPane();
        editorRoot.getChildren().add(btStart);
        root.getChildren().add(editorRoot);

        Scene scene = new Scene(root, 400, 400);
        scene.getStylesheets().add("custom-menu-button");

        stage.setScene(scene);
        stage.show();

        HBox fileRoot = new HBox();
        VBox menu = new VBox();
        menu.setFillWidth(true);
        Button btRestart = new Button("Restart");
        Button btNextRound = new Button("Next");
        btNextRound.setPrefWidth(100);
        btNextRound.getStyleClass().add("custom-menu-button");
        Label lblExpression = new Label(""); lblExpression.setPrefWidth(100);
        Label lblInfoDeck1 = new Label(""); lblInfoDeck1.setPrefWidth(100);
        Label lblInfoDeck2 = new Label(""); lblInfoDeck2.setPrefWidth(100);
        Label lblResult = new Label("");
        btRestart.setPrefWidth(100);
        btRestart.getStyleClass().add("custom-menu-button");
        btRestart.setOnAction(actionEvent -> {
            FadeTransition hideFileRootTransition = new FadeTransition(Duration.millis(500), fileRoot);
            hideFileRootTransition.setFromValue(1.0);
            hideFileRootTransition.setToValue(0.0);

            FadeTransition showEditorRootTransition = new FadeTransition(Duration.millis(500), editorRoot);
            showEditorRootTransition.setFromValue(0.0);
            showEditorRootTransition.setToValue(1.0);

            showEditorRootTransition.play();
            hideFileRootTransition.play();
            root.getChildren().remove(fileRoot);

            deck1.removeAll(deck1);
            deck2.removeAll(deck2);
            setDecks(deck, d1, d2);
            lblInfoDeck1.setText("");
            lblInfoDeck2.setText("");
            lblExpression.setText("");
            lblResult.setText("");
            btNextRound.setDisable(false);
        });

        btNextRound.setOnAction(actionEvent -> {
            lblInfoDeck1.setText("");
            lblInfoDeck2.setText("");
            ++roundsCounter;

            if (roundsCounter == 106){
                lblResult.setText("botva");
                btNextRound.setDisable(true);
                lblInfoDeck1.setText(deckToString(deck1, container));
                lblInfoDeck2.setText(deckToString(deck2, container));
                return;
            }

            if (deck1.isEmpty()){
                lblResult.setText("deck2 won " + roundsCounter + "rnd");
                btNextRound.setDisable(true);
                lblInfoDeck1.setText(deckToString(deck1, container));
                lblInfoDeck2.setText(deckToString(deck2, container));
                return;
            }

            if (deck2.isEmpty()){
                lblResult.setText("deck1 won " + roundsCounter + "rnd");
                btNextRound.setDisable(true);
                lblInfoDeck1.setText(deckToString(deck1, container));
                lblInfoDeck2.setText(deckToString(deck2, container));
                return;
            }

            Card cardDeck1 = deck1.poll();
            Card cardDeck2 = deck2.poll();

            if (cardDeck1.getD() == 1 && cardDeck2.getD() == 9){
                lblExpression.setText("" + cardDeck1.getD() + " < " + cardDeck2.getD());
                deck2.add(cardDeck1);
                deck2.add(cardDeck2);
                return;
            }
            if (cardDeck1.getD() == 9 && cardDeck2.getD() == 1) {
                lblExpression.setText("" + cardDeck1.getD() + " > " + cardDeck2.getD());
                deck1.add(cardDeck2);
                deck1.add(cardDeck1);
                return;
            }



            if (cardDeck1.getD() > cardDeck2.getD()){
                lblExpression.setText("" + cardDeck1.getD() + " > " + cardDeck2.getD());
                deck1.add(cardDeck2);
                deck1.add(cardDeck1);
            }
            else {
                lblExpression.setText("" + cardDeck1.getD() + " < " + cardDeck2.getD());
                deck2.add(cardDeck1);
                deck2.add(cardDeck2);
            }

            lblInfoDeck1.setText(deckToString(deck1, container));
            lblInfoDeck2.setText(deckToString(deck2, container));

        });
        menu.getChildren().addAll(btRestart, btNextRound, lblInfoDeck1, lblExpression, lblInfoDeck2, lblResult);
        VBox.setVgrow(btNextRound, Priority.ALWAYS);
        fileRoot.getChildren().add(menu);

        btStart.setOnAction(actionEvent ->  {
            root.getChildren().add(fileRoot);
            FadeTransition hideEditorRootTransition = new FadeTransition(Duration.millis(500), editorRoot);
            hideEditorRootTransition.setFromValue(1.0);
            hideEditorRootTransition.setToValue(0.0);

            FadeTransition showFileRootTransition = new FadeTransition(Duration.millis(500), fileRoot);
            showFileRootTransition.setFromValue(0.0);
            showFileRootTransition.setToValue(1.0);
            hideEditorRootTransition.play();
            showFileRootTransition.play();
            lblInfoDeck1.setText(deckToString(deck1, container));
            lblInfoDeck2.setText(deckToString(deck2, container));
        });

    }

}
