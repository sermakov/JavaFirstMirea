package ru.mirea.task16.CalculatorApp.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import ru.mirea.task16.CalculatorApp.core.CalculatorCore;
import ru.mirea.task16.CalculatorApp.core.ICalculatorCore;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    private final StringProperty expression;
    private final StringProperty exception;
    private ICalculatorCore calculatorCore;
    private int openBracketCount = 0;

    private String functionRegex = "cos\\($|sin\\($|tan\\($|ctg\\($|exp\\($|log\\($";
    private String operationRegex = "[-+\\/*^]$";
    private String digitOrCloseBracket = "\\d$|[)]$";
    private String openBracketRegex = "[(]$";
    private String closeBracketRegex = "[)]$";
    private String zeroRegex = "[0]$";

//    private String closeBracketRegex = "\\d$";

    public Calculator(String expression, String exception) {
        this.expression = new SimpleStringProperty(expression);
        this.exception = new SimpleStringProperty(exception);
    }

    public String getExpression() {
        return expression.get();
    }

    public StringProperty expressionProperty() {
        return expression;
    }

    public String getException(){ return exception.get(); }

    public StringProperty exceptionProperty() {return exception; }

    private int bracketCounter(String str){
        int bracketCounter = 0;
        for (int i = 0; i < str.length(); ++i){
            if (str.charAt(i) == '('){
                ++bracketCounter;
            }

            if (str.charAt(i) == ')'){
                --bracketCounter;
            }
        }
        return bracketCounter;
    }

    public void addDigit(String value) {
        String expr = this.expression.get();
        if(expr.equals("0") || expr.equals("(0")) {
            replaceLast(value);
        } else {
            Pattern pattern2 = Pattern.compile(closeBracketRegex);
            Matcher matcher2 = pattern2.matcher(expr);
            if(matcher2.find()){
                addSymbol("*" + value);
            }
            else {
                Pattern pattern3 = Pattern.compile(zeroRegex);
                Matcher matcher3 = pattern3.matcher(expr);
                if (matcher3.find()){
                    replaceLast(value);
                }
                else
                    addSymbol(value);
            }
        }
    }

    public void addOperation(String value) {
        String expr = this.expression.get();
        Pattern pattern = Pattern.compile(openBracketRegex);
        Matcher matcher = pattern.matcher(expr);
        if(matcher.find()) {
            openBracketCount += bracketCounter(value);
            return ;
        }
        Pattern pattern2 = Pattern.compile(operationRegex);
        Matcher matcher2 = pattern2.matcher(expr);
        if(matcher2.find()) {
            openBracketCount += bracketCounter(value);
            replaceLast(value);
        }
        else {
            openBracketCount += bracketCounter(value);
            addSymbol(value);
        }
    }

    public void addOpenBracket(String value) {
        String expr = this.expression.get();
        if(expr.equals("0")) {
            this.expression.set("(0");
        } else {
            Pattern pattern = Pattern.compile(digitOrCloseBracket);
            Matcher matcher = pattern.matcher(expr);
            if(matcher.find()) {
                addSymbol("*");
            }
            addSymbol(value);
        }
        ++openBracketCount;
    }

    public void addFunction(String value){
        String expr = this.expression.get();
        if(expr == "0"){
            ++openBracketCount;
            this.expression.set(value + "0");
        } else {
            Pattern pattern = Pattern.compile(digitOrCloseBracket);
            Matcher matcher = pattern.matcher(expr);
            if(matcher.find()) {
                ++openBracketCount;
                addSymbol("*");
            }
            addSymbol(value);
        }
    }

    public void addCloseBracket(String value) {
        if(openBracketCount <= 0) {
            return ;
        }
        String expr = this.expression.get();
        Pattern pattern = Pattern.compile(operationRegex);
        Matcher matcher = pattern.matcher(expr);
        if(matcher.find()) {
            return ;
        }
        Pattern pattern2 = Pattern.compile(digitOrCloseBracket);
        Matcher matcher2 = pattern2.matcher(expr);
        if(matcher2.find()) {
            addSymbol(value);
        }
        --openBracketCount;
    }
    //closing bracket don't used after adding operation or function in the row.

    private void addSymbol(String value) {
        this.expression.set(this.expression.get() + value);
    }

    private void replaceLast(String value){  //replaceLast
        String expr = this.expression.get();
        this.expression.set(expr.substring(0, expr.length() - 1) + value);;
    }

    public void setException(String value) {
        this.exception.set(value);
    }

    public void backspace() {
        int symbolCount = 1;
        String expr = this.expression.get();
        Pattern pattern = Pattern.compile(functionRegex);
        Matcher matcher = pattern.matcher(expr);
        if(matcher.find()) {
            symbolCount = 4;
        }
        expression.set(expr.substring(0, expr.length() - symbolCount));
        this.expression.set(this.expression.get());
    }

    public void reset(){
        this.expression.set("0");
    }

    public void Eval(){
        String expression = this.expression.get();
        calculatorCore = new CalculatorCore();
        expression = expression + "= " + calculatorCore.Eval(expression);
        this.expression.set(expression);
    }

}
