package ru.mirea.task25;

public class Sugar extends DecoratorOption {
    public Sugar(Decorator decorator) {
        super(decorator, "Sugar added!", 200);
    }
}