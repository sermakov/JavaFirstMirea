package ru.mirea.task12;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    public int compare(Student a, Student b){

        if(a.getScore()> b.getScore())
            return 1;
        else if(a.getScore()< b.getScore())
            return -1;
        else
            return 0;
    }
}
