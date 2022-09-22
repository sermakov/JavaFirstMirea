package ru.mirea.task12;

public class MergeSort
{
    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right)
    {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right)
            if (l[i].compare(l[i], r[j]) < 1)
                a[k++] = l[i++];
            else
                a[k++] = r[j++];
        while (i < left)
            a[k++] = l[i++];
        while (j < right)
            a[k++] = r[j++];
    }

    public static void mergeSort(Student[] a, int n)
    {
        if (n < 2)
            return;
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];
        for (int i = 0; i < mid; i++)
            l[i] = a[i];
        for (int i = mid; i < n; i++)
            r[i - mid] = a[i];
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(a, l, r, mid, n - mid);
    }

    public static void main(String[] args)
    {
        Student Students1[] = new Student[5];
        Students1[0] = new Student(4, 1);
        Students1[1] = new Student(2, 2);
        Students1[2] = new Student(5, 3);
        Students1[3] = new Student(3, 4);
        Students1[4] = new Student(1, 5);
        Student Students2[] = new Student[5];
        Students2[0] = new Student(9, 6);
        Students2[1] = new Student(7, 7);
        Students2[2] = new Student(10, 8);
        Students2[3] = new Student(8, 9);
        Students2[4] = new Student(6, 10);
        mergeSort(Students1, 5);
        mergeSort(Students2, 5);
        Student Students[] = new Student[10];
        merge(Students, Students1, Students2, 5, 5);
        for (int i = 0; i < 10; i++)
            System.out.println(Students[i].id + " " + Students[i].GPA);
    }
}
