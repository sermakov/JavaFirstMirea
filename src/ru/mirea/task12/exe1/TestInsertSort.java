package ru.mirea.task12.exe1;

public class TestInsertSort {

    public int size = 10;
    Student[] studentsArray = new Student[size];

    public static void main(String[] args) {

        TestInsertSort obj = new TestInsertSort();
        obj.init(); obj.print(); obj.insertSort();
        System.out.println();
        obj.print();

    }

    public void print(){
        for (int i = 0; i < size; ++i)
            System.out.println("i: " + i + " obj " + studentsArray[i]);
    }

    public void init(){
        for(int i = 0; i < size; ++i){
            studentsArray[i] = new Student(size - 1 - i, "Il" + i, (int)Math.random() * 5 + 2);
        }
    }

    public void insertSort(){
        for (int i = 0; i < size; ++i){
            int j = i;
            while (j - 1 >= 0 && studentsArray[j].id < studentsArray[j - 1].id){
                Student tmp = studentsArray[j];
                studentsArray[j] = studentsArray[j - 1];
                studentsArray[j - 1] = tmp;
                --j;
            }
        }
    }
}
