package ru.mirea.task6.exe1;

public class Planet {
    private String name;
    private String type;

    Planet( String type, String name)
    {
        this.name = name;
        this.type = type;
    }

    public String getName() { return name;}
    public String getType() {return type;}
}

