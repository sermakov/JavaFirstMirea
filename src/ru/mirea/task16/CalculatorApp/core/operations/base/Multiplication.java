package ru.mirea.task16.CalculatorApp.core.operations.base;

import ru.mirea.task16.CalculatorApp.core.operations.Binary;
import ru.mirea.task16.CalculatorApp.core.operations.Operation;

public class Multiplication extends Binary {
    public Multiplication(Operation l, Operation r){
        this.left = l;
        this.right = r;
    }
    public double Eval(){
        return left.Eval() * right.Eval();
    }
}
