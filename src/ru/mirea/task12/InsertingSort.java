package ru.mirea.task12;

public class InsertingSort  {
    public static void InsertingSort (Student[] array) {
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            Student value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.getID() < array[i].getID()) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }
}
