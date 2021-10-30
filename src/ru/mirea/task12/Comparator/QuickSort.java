package ru.mirea.task12.Comparator;

public class QuickSort implements Comparator {
    private int size = 10;
    private Studs[] students = new Studs[10];
    public int getSize() {
        return size;
    }
    public void quickSort(int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        double pivot = students[(leftMarker + rightMarker) / 2].gpa;
        do {
            while (students[leftMarker].gpa > pivot) {
                leftMarker++;
            }
            while (students[rightMarker].gpa < pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Studs tmp = students[leftMarker];
                    students[leftMarker] = students[rightMarker];
                    students[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(leftBorder, rightMarker);
        }
    }

    public void print(){
        for (int i = 0; i < size; ++i)
            System.out.println(students[i]);
    }

    public void init(){
        for(int i = 0; i < size; ++i) students[i] = new Studs(size - 1 - i, (int) ((Math.random() * ((100) + 1)) + 0));
    }
}
