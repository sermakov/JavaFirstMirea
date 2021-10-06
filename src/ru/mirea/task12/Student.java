package ru.mirea.task12;

public class Student {
    private String fullName="";
    private int iDNumber = 0;
    private int finalScore =0;
    Student(){};
    public Student(String fullName,int iDNumber, int finalScore){
        this.fullName=fullName;
        this.iDNumber=iDNumber;
        this.finalScore=finalScore;
    }
    public int getID(){
        return this.iDNumber;
    }
    public int getFinalScore(){
        return this.finalScore;
    }

    @Override
    public String toString() {
        return "Student name: " + fullName + "\niDNumber: " + iDNumber + "\nFinal score: " + finalScore + "\n-----------";
    }
}