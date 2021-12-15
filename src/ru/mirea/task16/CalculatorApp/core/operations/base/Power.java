package ru.mirea.task16.CalculatorApp.core.operations.base;

import ru.mirea.task16.CalculatorApp.core.operations.Binary;
import ru.mirea.task16.CalculatorApp.core.operations.Operation;

public class Power extends Binary {
    public Power(Operation l, Operation r){
        left = l;
        right = r;
    }
    public double Eval(){
        return Math.pow(left.Eval(), right.Eval());
    }
}
