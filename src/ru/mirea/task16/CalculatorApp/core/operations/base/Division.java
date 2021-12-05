package ru.mirea.task16.CalculatorApp.core.operations.base;

import ru.mirea.task16.CalculatorApp.core.operations.Binary;
import ru.mirea.task16.CalculatorApp.core.operations.Operation;

public class Division extends Binary {
    public Division(Operation l, Operation r){
        this.left = l;
        this.right = r;
    }
    public double Eval(){
        if (right.Eval() != 0)
            return left.Eval() / right.Eval();
        return Double.POSITIVE_INFINITY;
    }
}
