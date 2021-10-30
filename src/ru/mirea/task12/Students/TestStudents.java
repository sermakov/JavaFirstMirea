package ru.mirea.task12.Students;

public class TestStudents
{
    public int size = 10;
    Students[] studentsArray = new Students[size];
    public static void main(String[] args) {
        TestStudents ts = new TestStudents();
        ts.init();
        ts.print();
        ts.insertSort();
        System.out.println();
        ts.print();
    }
    public void print(){
        for (int i = 0; i < size; ++i)
            System.out.println("i: " + i + " obj " + studentsArray[i]);
    }
    public void init(){
        for(int i = 0; i < size; ++i){
            studentsArray[i] = new Students(size - 1 - i, "XXXX" + i);
        }
    }
    public void insertSort(){
        for (int i = 0; i < size; ++i){
            int j = i;
            while (j - 1 >= 0 && studentsArray[j].id < studentsArray[j - 1].id){
                Students tmp = studentsArray[j];
                studentsArray[j] = studentsArray[j - 1];
                studentsArray[j - 1] = tmp;
                --j;
            }
        }
    }
}
