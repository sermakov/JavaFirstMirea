package ru.mirea.task12;

public class SortingStudentsByGPA
{
    private static int partition(Student arr[], int begin, int end)
    {
        Student pivot = arr[end];
        int i = (begin-1);
        for (int j = begin; j < end; j++)
        {
            if (arr[j].compare(arr[j], pivot) < 1)
            {
                i++;
                Student swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        Student swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;
        return i+1;
    }

    private static void quickSort(Student arr[], int begin, int end)
    {
        if (begin < end)
        {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    public static void main(String[] args)
    {
        Student Students[] = new Student[5];
        Students[0] = new Student(4, 1);
        Students[1] = new Student(2, 2);
        Students[2] = new Student(5, 3);
        Students[3] = new Student(3, 4);
        Students[4] = new Student(1, 5);
        quickSort(Students, 0, 4);
        for (int i = 0; i < 5; i++)
            System.out.println(Students[i].id + " " + Students[i].GPA);
    }
}
