package ru.mirea.task16.CalculatorApp.core.operations;

public class Binary extends Operation{
    protected Operation left;
    protected Operation right;

    public Binary(Operation left, Operation right){
        this.left = left;
        this.right = right;
    }

    public Binary() {
    }

    public double Eval() { return 0;}
}
