package ru.mirea.task14.exe1;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Stack;

public class TestCardGame extends Application {
    private final static int sizeOfDeck = 10;
    private Stack<Card> deck1 = new Stack<Card>();
    private Stack<Card> deck2 = new Stack<Card>();
    private Stack<Card> container = new Stack<Card>();
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
            deck1.push(card);
        }

        for (int i = sizeOfDeck / 2; i < sizeOfDeck; ++i){
            Card card = new Card(d2.get(i - sizeOfDeck / 2));
            deck2.push(card);
        }
    }

    public void popAll(Stack<Card> into, Stack<Card> out){
        while (!out.empty()){
            Card card = out.pop();
            into.push(card);
        }
    }

    public String deckToString(Stack<Card> deck, Stack<Card> container){
        String result = new String("");
        while (!deck.empty()){
            Card card = deck.pop();
            container.push(card);
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

                deck1.removeAllElements();
                deck2.removeAllElements();
                setDecks(deck, d1, d2);
                lblInfoDeck1.setText("");
                lblInfoDeck2.setText("");
                lblExpression.setText("");
                lblResult.setText("");
        });

        Button btNextRound = new Button("Next");
        btNextRound.setPrefWidth(100);
        btNextRound.getStyleClass().add("custom-menu-button");
        btNextRound.setOnAction(actionEvent -> {
            lblInfoDeck1.setText("");
            lblInfoDeck2.setText("");
            ++roundsCounter;

            if (roundsCounter == 106){
                lblResult.setText("botva");
                btNextRound.disabledProperty();
                lblInfoDeck1.setText(deckToString(deck1, container));
                lblInfoDeck2.setText(deckToString(deck2, container));
                return;
            }

            if (deck1.empty()){
                lblResult.setText("deck2 won " + roundsCounter + "rnd");
                btNextRound.disabledProperty();
                lblInfoDeck1.setText(deckToString(deck1, container));
                lblInfoDeck2.setText(deckToString(deck2, container));
                return;
            }

            if (deck2.empty()){
                lblResult.setText("deck1 won " + roundsCounter + "rnd");
                btNextRound.disabledProperty();
                lblInfoDeck1.setText(deckToString(deck1, container));
                lblInfoDeck2.setText(deckToString(deck2, container));
                return;
            }

            Card cardDeck1 = new Card(deck1.pop().getD());
            Card cardDeck2 = new Card(deck2.pop().getD());

            if (cardDeck1.getD() == 1 && cardDeck2.getD() == 9){
                lblExpression.setText("" + cardDeck1.getD() + " < " + cardDeck2.getD());
                popAll(container, deck2);
                deck2.push(cardDeck1);
                deck2.push(cardDeck2);
                popAll(deck2, container);
                return;
            }
            if (cardDeck1.getD() == 9 && cardDeck2.getD() == 1) {
                lblExpression.setText("" + cardDeck1.getD() + " > " + cardDeck2.getD());
                popAll(container, deck1);
                deck1.push(cardDeck2);
                deck1.push(cardDeck1);
                popAll(deck1, container);
                return;
            }



            if (cardDeck1.getD() > cardDeck2.getD()){
                lblExpression.setText("" + cardDeck1.getD() + " > " + cardDeck2.getD());
                popAll(container, deck1);
                deck1.push(cardDeck2);
                deck1.push(cardDeck1);
                popAll(deck1, container);
            }
            else {
                lblExpression.setText("" + cardDeck1.getD() + " < " + cardDeck2.getD());
                popAll(container, deck2);
                deck2.push(cardDeck1);
                deck2.push(cardDeck2);
                popAll(deck2, container);
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
