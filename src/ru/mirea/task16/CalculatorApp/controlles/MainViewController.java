package ru.mirea.task16.CalculatorApp.controlles;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import ru.mirea.task16.CalculatorApp.models.Calculator;

public class MainViewController {
    //Model
    Calculator calculator;

    //View nodes
    @FXML private Label accountHolder;
    //@FXML private TextField amountTextField;

    public void initialize(){
        //get model
        calculator = new Calculator("1+1");

        //link Model with View
        accountHolder.textProperty().bind(calculator.expressionProperty());

        //link Controller to View - ensure only numeric input (integers) in text field
    }

    @FXML
    private void handleOperation(Event event){
        Node node = (Node) event.getSource() ;
        String data = (String) node.getUserData();
        String expr = calculator.getExpression();

        calculator.addSymbol(data);
        event.consume();

    }

    @FXML
    private void handleDigit(Event event) {

        Node node = (Node) event.getSource() ;
        String data = (String) node.getUserData();
        calculator.addSymbol(data);
        event.consume();
    }

    @FXML
    private void handleBackspace(Event event) {
        calculator.backspace();
        event.consume();
    }

    @FXML
    private void handleClear(Event event){
        calculator.clear();
        event.consume();
    }

    @FXML
    private void handleEval(Event event){
        calculator.Eval();
    }

}
