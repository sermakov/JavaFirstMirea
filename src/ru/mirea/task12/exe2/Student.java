package ru.mirea.task12.exe2;

public class Student {
    public int id = 0;
    public String name = "";
    public int averageMark = 0;
    public double gpa = 0;

    public Student(int id, String name, int averageMark, double gpa){
        this.name = name;
        this.id = id;
        this.averageMark = averageMark;
        this.gpa = gpa;
    }

    public void copy(Student student){
        this.averageMark = student.averageMark;
        this.id = student.id;
        this.name = student.name;
        this.gpa = gpa;
    }



    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", averageMark=" + averageMark +
                ", gpa=" + gpa +
                '}';
    }
}
