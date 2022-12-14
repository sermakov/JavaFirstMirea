package ru.mirea.task16.CalculatorApp.core.operations.function;

import ru.mirea.task16.CalculatorApp.core.operations.Operation;
import ru.mirea.task16.CalculatorApp.core.operations.Unary;

public class Exp extends Unary {
    public Exp(Operation one){
        this.one = one;
    }
    public double Eval(){
        return Math.exp(one.Eval());
    }
}
