package ru.mirea.task16.CalculatorApp.core;

import ru.mirea.task16.CalculatorApp.core.operations.base.*;
import ru.mirea.task16.CalculatorApp.core.operations.function.*;
import ru.mirea.task16.CalculatorApp.xException.CantParseException;
import ru.mirea.task16.CalculatorApp.core.operations.Number;
import ru.mirea.task16.CalculatorApp.core.operations.Operation;

public class CalculatorCore implements ICalculatorCore {
    private String source;
    private int index = 0;
    public CalculatorCore(String str) { source = str; }
    public CalculatorCore() { source = ""; }
    private double MIN_DOUBLE_ZERO = 1E-15;

    public double Eval()
    {
        Operation root = Parse0();
        double res = root.Eval();
        if( Math.abs(res) <  MIN_DOUBLE_ZERO ) {
            res = 0;
        }
        return res;
    }

    public double Eval(String str)
    {
        source = str;
        return Eval();
    }

    public Operation Parse0()
    {
        Operation result = Parse1();

        for (; ; )
        {
            if (Match('+'))
                result = new Addition(result, Parse1());
            else if (Match('-'))
                result = new Subtraction(result, Parse1());
            else
                return result;
        }
    }

    public Operation Parse1()
    {
        Operation result = Parse2();
        for (; ; )
        {
            if (Match('*'))
                result = new Multiplication(result, Parse2());
            else if (Match('/'))
                result = new Division(result, Parse2());
            else
                return result;
        }
    }

    public Operation Parse2()
    {
        Operation result = Parse3();
        if (Match('^'))
        {
            result = new Power(result, Parse2());
        }
        return result;
    }

    public Operation Parse3()
    {
        Operation result = Parse4();
        if (index < source.length() && (Match('c') || Match('s') || Match('t')  || Match('e') || Match('l')))
        {
            --index;
            String MathOperation = null;
            MathOperation = source.substring(index, index + 3);

            if (MathOperation.equals("cos"))
            {
                index += 3;
                result = new Cos(Parse4());

            }

            if (MathOperation.equals("sin"))
            {
                index += 3;
                result = new Sin(Parse4());
            }

            if (MathOperation.equals("tan"))
            {
                index += 3;
                result = new Tan(Parse4());
            }

            if (MathOperation.equals("ctg"))
            {
                index += 3;
                result = new Ctan(Parse4());
            }

            if (MathOperation.equals("exp"))
            {
                index += 3;
                result = new Exp(Parse4());
            }

            if (MathOperation.equals("log")){
                index += 3;
                result = new Log(Parse4());
            }
        }
        return result;

    }
    public Operation Parse4() {
        int index1 = 0;
        int index2 = 0;
        String cpyStr = null;
        Operation result = null;

        if (Match('-')) {
            result = new UnaryMinus(Parse2());
        } else if (Match('(')) {
            result = Parse0();
            if (!Match(')')) {
            }
        } else {

            double value = 0.0;
            index1 = index;


            if (Match('p')) {
                value = Math.PI;
            }

            if (Match('e')) {
                value = Math.E;
            }

            while (index < source.length() && (Character.isDigit(source.charAt(index)) || Match('.') || Match('e')))
                ++index;

            index2 = Math.min(index, source.length());

            cpyStr = source.substring(index1, index2);
            try {
                if (Character.isDigit(source.charAt(index1)) && (value = Double.parseDouble(cpyStr)) < 0)
                    throw new CantParseException("Cant parse number '%s'", Double.POSITIVE_INFINITY);
            }
            catch(CantParseException ex){
                System.out.println(ex.getMessage());
                value = ex.getValue();
            }

            result = new Number(value);
        }
        return result;
    }

    private boolean Match(char ch)
    {
        if (index >= source.length())
            return false;

        while (source.charAt(index) == ' ') ++index;
        if (source.charAt(index) == ch)
        {
            ++index;
            return true;
        }
        else
            return false;

    }

}


