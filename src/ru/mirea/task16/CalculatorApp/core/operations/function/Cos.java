package ru.mirea.task16.CalculatorApp.core.operations.function;

import ru.mirea.task16.CalculatorApp.core.operations.Operation;
import ru.mirea.task16.CalculatorApp.core.operations.Unary;

public class Cos extends Unary {
    public Cos(Operation one){
        this.one = one;
    }
    public double Eval(){
        return Math.cos(one.Eval());
    }
}
