package ru.mirea.task12;

public class InsertionSort
{
    public static void main(String[] args)
    {
        Student idNumber[] = new Student[5];
        Student swap;
        idNumber[0] = new Student(4, 1);
        idNumber[1] = new Student(2, 2);
        idNumber[2] = new Student(5, 3);
        idNumber[3] = new Student(3, 4);
        idNumber[4] = new Student(1, 5);
        for (int i = 1; i < 5; i++)
            for (int j = 0; j < i; j++)
            {
                if (idNumber[i - j].id < idNumber[i - j - 1].id)
                {
                    swap = idNumber[i - j];
                    idNumber[i - j] = idNumber[i - j - 1];
                    idNumber[i - j - 1] = swap;
                }
            }
        for (int i = 0; i < 5; i++)
            System.out.println(idNumber[i].id + " " + idNumber[i].GPA);
    }
}
