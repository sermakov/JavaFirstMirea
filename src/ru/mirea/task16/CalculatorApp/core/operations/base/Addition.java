package ru.mirea.task16.CalculatorApp.core.operations.base;

import ru.mirea.task16.CalculatorApp.core.operations.Binary;
import ru.mirea.task16.CalculatorApp.core.operations.Operation;

public class Addition extends Binary {
    public Addition(Operation l, Operation r){
        this.left = l;
        this.right = r;
    }
    public double Eval(){
        return left.Eval() + right.Eval();
    }
}
