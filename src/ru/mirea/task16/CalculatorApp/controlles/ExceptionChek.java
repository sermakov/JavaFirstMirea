package ru.mirea.task16.CalculatorApp.controlles;

import ru.mirea.task16.CalculatorApp.models.EventState;

public class ExceptionChek {
    private String exception;

    public String getException() {
        return exception;
    }

    public boolean BracketsChek(String source){
        int OpenBracket = 0; int CloseBracket = 0;
        for (int i = 0; i < source.length(); ++i){
            if (source.charAt(i) == '('){
                ++OpenBracket;
            }

            if (source.charAt(i) == '('){
                ++CloseBracket;
            }
        }

        if (OpenBracket > CloseBracket){
            this.exception = " symbols '(' more than ')' by - " + Math.abs(OpenBracket - CloseBracket);
            return false;
        }

        if (OpenBracket > CloseBracket){
            this.exception = " symbols ')' more than '(' by - " + Math.abs(OpenBracket - CloseBracket);
            return false;
        }

        this.exception = " none exceptions";
        return true;
    }

    /*public EventState lastSymbolChek(String source){
        char lastSymbol = source.charAt(source.length() - 1);
        if (lastSymbol <= '9' && lastSymbol >= '0')
            return EventState.DIGIT;
        if ((lastSymbol <= '/' && lastSymbol >= '*') || lastSymbol == '^')
            return EventState.OPERATION;

    }*/
}
