package ru.mirea.task16.CalculatorApp.core.operations.base;

import ru.mirea.task16.CalculatorApp.core.operations.Operation;
import ru.mirea.task16.CalculatorApp.core.operations.Unary;

public class UnaryMinus extends Unary {
    public UnaryMinus(Operation op){
        one = op;
    }
    public double Eval(){
        return -one.Eval();
    }
}
