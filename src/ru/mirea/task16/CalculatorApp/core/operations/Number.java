package ru.mirea.task16.CalculatorApp.core.operations;

public class Number extends Operation{
    protected double value;

    public Number(double value){
        this.value = value;
    }
    public double Eval() { return value;}
}
