package ru.mirea.task12.exe2;

public class QuickSort implements Comparator{
    private int size = 10;
    private Student[] students = new Student[10];

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
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    Student tmp = students[leftMarker];
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
            System.out.println("i: " + i + " obj " + students[i]);
    }

    public void init(){
        for(int i = 0; i < size; ++i){
            students[i] = new Student(size - 1 - i, "Il" + i, (int)Math.random() * 5 + 2, Math.random());
        }
    }
}
