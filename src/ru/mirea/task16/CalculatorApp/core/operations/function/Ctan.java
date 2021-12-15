package ru.mirea.task16.CalculatorApp.core.operations.function;

import ru.mirea.task16.CalculatorApp.core.operations.Operation;
import ru.mirea.task16.CalculatorApp.core.operations.Unary;

public class Ctan extends Unary {
    public Ctan(Operation one){
        this.one = one;
    }
    public double Eval(){
        return 1 / Math.tan(one.Eval());
    }
}
