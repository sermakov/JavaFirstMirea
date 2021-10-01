package ru.mirea.task12.exe3;

public class StudentsArray {
    public int size = 0;
    public Student[] students = new Student[size];

    public StudentsArray(int size){
        this.size = size;
        students = new Student[size];
    }

    public void init(){
        for (int i = 0; i < size; ++i)
            students[i] = new Student(size - 1, "Il" + i, (int)Math.random() * 10 + 2, Math.random());
    }

    public void print(){
        for (int i = 0; i < size; ++i)
            System.out.println("i: " + i + " obj " + students[i]);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
