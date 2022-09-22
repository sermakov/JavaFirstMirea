package ru.mirea.task12;

import java.util.Comparator;

public class Student implements Comparator<Student>
{
    public Student(int id, int GPA)
    {
        this.id = id;
        this.GPA = GPA;
    }

    public int id;
    public int GPA;

    public int compare(Student o1, Student o2)
    {
        int c = 0;
        if (o1.GPA < o2.GPA)
            c = 1;
        if (o1.GPA > o2.GPA)
            c = -1;
        return(c);
    }
}
