package ru.mirea.task16.CalculatorApp.controlles;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import ru.mirea.task16.CalculatorApp.models.Calculator;
import ru.mirea.task16.CalculatorApp.models.EventState;

public class MainViewController {
    //Model
    Calculator calculator;
    ExceptionChek exceptionChek;

    //View nodes
    @FXML private Label ExpressionLabel;
    //@FXML private TextField amountTextField;
    @FXML private Label ExceptionStateLabel;

    public void initialize(){
        //get model
        calculator = new Calculator("1+1", "none exceptions");

        //link Model with View
        ExpressionLabel.textProperty().bind(calculator.expressionProperty());
        ExceptionStateLabel.textProperty().bind(calculator.exceptionProperty());


        //link Controller to View - ensure only numeric input (integers) in text field
    }

    @FXML
    private void handleOperation(Event event){
        Node node = (Node) event.getSource() ;
        String data = (String) node.getUserData();
        EventState LastEvent = calculator.getLastEvent();
        if (LastEvent == EventState.DIGIT || LastEvent == EventState.CLOSEBRACKET || LastEvent == EventState.UNAOPERATION) {
            calculator.addSymbol(data);
            exceptionChek.BracketsChek(calculator.getExpression());
            calculator.setException(exceptionChek.getException());
            event.consume();
            calculator.setLastEvent(EventState.OPERATION);
        }
    }

    @FXML
    private void handleUnaOperation(Event event){
        Node node = (Node) event.getSource() ;
        String data = (String) node.getUserData();
        EventState LastEvent = calculator.getLastEvent();
        if (LastEvent == EventState.UNAOPERATION || LastEvent == EventState.DIGIT || LastEvent == EventState.CLOSEBRACKET) {
            calculator.addSymbol(data);
            exceptionChek.BracketsChek(calculator.getExpression());
            calculator.setException(exceptionChek.getException());
            event.consume();
            calculator.setLastEvent(EventState.UNAOPERATION);
        }
    }

    @FXML
    private void handleDigit(Event event) {
        Node node = (Node) event.getSource() ;
        String data = (String) node.getUserData();
        EventState LastEvent = calculator.getLastEvent();
        if (LastEvent != EventState.UNAOPERATION && LastEvent != EventState.CLOSEBRACKET) {
            calculator.addSymbol(data);
            event.consume();
            exceptionChek.BracketsChek(calculator.getExpression());
            calculator.setException(exceptionChek.getException());
            calculator.setLastEvent(EventState.DIGIT);
        }
    }

    @FXML
    private void handleFunction(Event event) {
        Node node = (Node) event.getSource() ;
        String data = (String) node.getUserData();
        EventState LastEvent = calculator.getLastEvent();
        if (LastEvent != EventState.DIGIT && LastEvent != EventState.UNAOPERATION && LastEvent != EventState.CLOSEBRACKET){
            calculator.addSymbol(data);
            event.consume();
            exceptionChek.BracketsChek(calculator.getExpression());
            calculator.setException(exceptionChek.getException());
            calculator.setLastEvent(EventState.FUNCTION);
        }
    }

    @FXML
    private void handleOpenBracket(Event event){
        Node node = (Node) event.getSource() ;
        String data = (String) node.getUserData();
        EventState LastEvent = calculator.getLastEvent();
        if (LastEvent != EventState.DIGIT && LastEvent  != EventState.UNAOPERATION && LastEvent != EventState.CLOSEBRACKET){
            calculator.addSymbol(data);
            event.consume();
            exceptionChek.BracketsChek(calculator.getExpression());
            calculator.setException(exceptionChek.getException());
            calculator.setLastEvent(EventState.OPENBRACKET);
        }
    }

    @FXML
    private void handleCloseBracket(Event event){
        Node node = (Node) event.getSource() ;
        String data = (String) node.getUserData();
        EventState LastEvent = calculator.getLastEvent();
        if (LastEvent == EventState.DIGIT || LastEvent == EventState.CLOSEBRACKET) {
            calculator.addSymbol(data);
            event.consume();
            exceptionChek.BracketsChek(calculator.getExpression());
            calculator.setException(exceptionChek.getException());
            calculator.setLastEvent(EventState.CLOSEBRACKET);
        }
    }

    @FXML
    private void handleBackspace(Event event) {
        calculator.backspace();
        calculator.setException(exceptionChek.getException());

        event.consume();
    }

    @FXML
    private void handleClear(Event event){
        calculator.clear();
        event.consume();
        calculator.setLastEvent(EventState.CLEAR);
    }

    @FXML
    private void handleEval(Event event){
        calculator.Eval();
    }
}
