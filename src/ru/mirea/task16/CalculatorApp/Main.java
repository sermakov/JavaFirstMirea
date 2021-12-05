package ru.mirea.task16.CalculatorApp;

import ru.mirea.task16.CalculatorApp.core.CalculatorCore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String exprStr;// = "cos(p) + 2 + 2 * 3 ^ 2 - 40 / (20 - 18)";
        System.out.println("Input expression: ");
        Scanner in = new Scanner(System.in);
        exprStr = in.nextLine();
        CalculatorCore expr = new CalculatorCore(exprStr);
        double res = expr.Eval();
        System.out.println("Result: " + res + '\n');
        String str1 = "5";
        CalculatorCore expr1 = new CalculatorCore(str1);
        System.out.println("5 = result: " + expr1.Eval() + '\n');

        String str2 = "2+2";
        CalculatorCore expr2 = new CalculatorCore(str2);
        System.out.println("2+2 = result: " + expr2.Eval() + '\n');

        String str3 = "2 + 2 * 2";
        CalculatorCore expr3 = new CalculatorCore(str3);
        System.out.println("2 + 2 * 2 = result: " + expr3.Eval() + '\n');

        String str4 = "2 + 3 ^ 2 * 2 - 40 / 2";
        CalculatorCore expr4 = new CalculatorCore(str4);
        System.out.println("2 + 3 ^ 2 * 2 - 40 / 2 = result: " + expr4.Eval() + '\n');

        String str5 = "2+3^2*2-40/4^(1/2)";
        CalculatorCore expr5 = new CalculatorCore(str5);
        System.out.println("2+3^2*2-40/4^(1/2) = result: " + expr5.Eval() + '\n');

        String str6 = "1+2+3+4+5+6+7+8+9";
        CalculatorCore expr6 = new CalculatorCore(str6);
        System.out.println("1+2+3+4+5+6+7+8+9 = result: " + expr6.Eval() + '\n');
    }
}
