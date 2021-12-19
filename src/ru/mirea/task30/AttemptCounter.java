package ru.mirea.task30;

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
