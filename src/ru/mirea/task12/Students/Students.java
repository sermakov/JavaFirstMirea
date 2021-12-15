package ru.mirea.task12.Students;

public class Students {
    public int id = 0;
    public String name = "";

    Students(int id, String name){
        this.name = name;
        this.id = id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Студент: " + "id=" + id + ", имя: " + name;
    }
}
