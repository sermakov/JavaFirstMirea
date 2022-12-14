package ru.mirea.task12.exe1;

public class Student {
    public int id = 0;
    public String name = "";
    public int averageMark = 0;

    Student(int id, String name, int averageMark){
        this.name = name;
        this.id = id;
        this.averageMark = averageMark;
    }

    public void copy(Student student){
        this.averageMark = student.averageMark;
        this.id = student.id;
        this.name = student.name;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    public void setId(int id) {
        this.id = id;
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
                '}';
    }
}
