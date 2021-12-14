package ru.mirea.task16.CalculatorApp.controlles;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import ru.mirea.task16.CalculatorApp.models.Calculator;

public class MainViewController {
    //Model
    Calculator calculator;

    //View nodes
    @FXML private Label ExpressionLabel;
    //@FXML private TextField amountTextField;
    @FXML private Label ExceptionStateLabel;

    public void initialize(){
        //get model
        calculator = new Calculator("0", "none exceptions");

        //link Model with View
        ExpressionLabel.textProperty().bind(calculator.expressionProperty());
        ExceptionStateLabel.textProperty().bind(calculator.exceptionProperty());
        //link Controller to View
    }

    @FXML
    private void handleOperation(Event event){
        Node node = (Node) event.getSource() ;
        String data = (String) node.getUserData();
        calculator.addOperation(data);
        event.consume();
    }

    @FXML
    private void handleFunction(Event event){
        Node node = (Node) event.getSource() ;
        String data = (String) node.getUserData();
        calculator.addFunction(data);
        event.consume();
    }

    @FXML
    private void handleDigit(Event event) {
        Node node = (Node) event.getSource() ;
        String data = (String) node.getUserData();
        calculator.addDigit(data);
        event.consume();
    }

    @FXML
    private void handleOpenBracket(Event event){
        Node node = (Node) event.getSource() ;
        String data = (String) node.getUserData();
        calculator.addOpenBracket(data);
        event.consume();
    }

    @FXML
    private void handleCloseBracket(Event event){
        Node node = (Node) event.getSource();
        String data = (String) node.getUserData();
        calculator.addCloseBracket(data);
        event.consume();
    }

    @FXML
    private void handleBackspace(Event event) {
        calculator.backspace();
        event.consume();
    }

    @FXML
    private void handleClear(Event event){
        calculator.reset();
        event.consume();
    }

    @FXML
    private void handleEval(Event event){
        calculator.Eval();
    }
    @FXML
    //node.getStyleClass().add("custom-content");
    //https://vaadin.com/docs/v14/flow/element-api/tutorial-dynamic-styling
    private void handleSetStyle(Event event){
        Node node = (Node) event.getSource();
        Scene scene = node.getScene();
        scene.getStylesheets().clear();
        scene.setUserAgentStylesheet(null);
        scene.getStylesheets().add("resources/css/darkMode.css");
    }

}
