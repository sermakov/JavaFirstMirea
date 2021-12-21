package ru.mirea.task32;

import java.io.Serializable;

public class AttemptCounter implements Serializable
{
    private static final long serialVersionUID = 1L;
    public int number;

    public AttemptCounter()
    {
        number = 0;
    }
}
