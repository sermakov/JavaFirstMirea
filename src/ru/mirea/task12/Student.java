package ru.mirea.task12;

public class Student {
    private String fullName="";
    private int IDNumber = 0000;
    private int finalScore = 000;

    public Student(String fullName, int IDNumber, int finalScore) {
        this.fullName = fullName;
        this.IDNumber = IDNumber;
        this.finalScore = finalScore;
    }

    public int getID() {
        return this.IDNumber;
    }

    public int getScore() {
        return this.finalScore;
    }
    @Override
    public String toString() {
        return "Student № " + IDNumber +
                "\nFull Name - " + fullName +
                "\nFinal Score - " + finalScore + '\n';
    }
}
