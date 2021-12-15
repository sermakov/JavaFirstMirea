package ru.mirea.task16.CalculatorApp.core.operations;

public class Unary extends Operation{
    protected Operation one;
    public Unary(Operation op) {this.one = op; }

    public Unary() {
    }

    public double Eval(){return 0; }
}
