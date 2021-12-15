package ru.mirea.task12.Comparator;

public class Studs {
    public int id = 0;
    public int gpa = 0;

    public Studs(int id, int gpa){
        this.id = id;
        this.gpa = gpa;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Student " + id + ", gpa =" + gpa;
    }
}
