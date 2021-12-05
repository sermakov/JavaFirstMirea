package ru.mirea.task16.CalculatorApp.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import ru.mirea.task16.CalculatorApp.core.CalculatorCore;
import ru.mirea.task16.CalculatorApp.core.ICalculatorCore;

public class Calculator {

    private final StringProperty expression;
    private ICalculatorCore calculatorCore;

    public Calculator(String expression) {
        this.expression = new SimpleStringProperty(expression);
    }

    public String getExpression() {
        return expression.get();
    }

    public StringProperty expressionProperty() {
        return expression;
    }



    public void addSymbol(String value) {
        this.expression.set(this.expression.get() + value);
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
