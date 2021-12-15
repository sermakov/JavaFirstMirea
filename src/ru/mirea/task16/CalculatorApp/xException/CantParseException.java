package ru.mirea.task16.CalculatorApp.xException;

public class CantParseException extends Exception {
    private double value;

    public double getValue() {
        return value;
    }

    public CantParseException(String message, double value) {

        super(message);
        this.value = value;
    }
}
