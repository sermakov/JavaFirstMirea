package ru.mirea.task16.CalculatorApp.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import ru.mirea.task16.CalculatorApp.core.CalculatorCore;
import ru.mirea.task16.CalculatorApp.core.ICalculatorCore;

public class Calculator {

    private final StringProperty expression;
    private final StringProperty exception;
    private ICalculatorCore calculatorCore;
    EventState lastEvent;

    public Calculator(String expression, String exception) {

        this.expression = new SimpleStringProperty(expression);
        this.exception = new SimpleStringProperty(exception);
        lastEvent = EventState.DIGIT;
    }

    public String getExpression() {
        return expression.get();
    }

    public StringProperty expressionProperty() {
        return expression;
    }

    public String getException(){ return exception.get(); }

    public StringProperty exceptionProperty() {return exception; }

    public EventState getLastEvent() {
        return lastEvent;
    }

    public void setLastEvent(EventState lastEvent) {
        this.lastEvent = lastEvent;
    }

    public void addSymbol(String value) {
        this.expression.set(this.expression.get() + value);
    }

    public void setException(String str) {
        this.exception.set(str);
    }

    public void backspace() {
        String expr = this.expression.get();
        expression.set(expr.substring(0, expr.length() - 1));
        this.expression.set(this.expression.get());
    }

    public void clear(){
        this.expression.set("");
    }

    public void Eval(){
        String expression = this.expression.get();
        calculatorCore = new CalculatorCore();
        expression = expression + "= " + calculatorCore.Eval(expression);
        this.expression.set(expression);
    }
}
