package ru.mirea.task12.exe3;

public class MergeSort {

    public void mergeSort(Student[] ar, int left, int right) {
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(ar, left, delimiter - 1);
            mergeSort(ar, delimiter, right);
        }
        Student[] buffer = new Student[right - left + 1];
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            if (delimiter > right || ar[cursor].getGpa() > ar[delimiter].getGpa()) {
                buffer[i] = ar[cursor];
                cursor++;
            } else {
                buffer[i] = ar[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, ar, left, buffer.length);
    }

    public StudentsArray mergeSort2Lists(StudentsArray source1, StudentsArray source2) {

        mergeSort(source1.students, 0, source1.students.length - 1);
        mergeSort(source2.students, 0, source2.students.length - 1);

        StudentsArray result = new StudentsArray(source1.students.length + source2.students.length);

        for (int i = 0; i < source1.students.length; ++i) {
            result.students[i] = source1.students[i];
        }

        for (int i = 0; i < source2.students.length; ++i) {
            result.students[i + source1.students.length] = source2.students[i];
        }

        result.print();
        System.out.println();

        mergeSort(result.students, 0, source2.students.length + source1.students.length - 1);
        return result;
    }

}
