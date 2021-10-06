package ru.mirea.task12;

public class QuickSort {
public static void quickSort(int[] source, int leftBorder, int rightBorder){
    int leftMarker = leftBorder;
    int rightMarker = rightBorder;
    int pivot = source[(leftMarker + rightMarker) / 2];
        do {
        // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
        while (source[leftMarker] < pivot) {
            leftMarker++;
        }
        // Двигаем правый маркер, пока элемент больше, чем pivot
        while (source[rightMarker] > pivot) {
            rightMarker--;
        }
        // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
        if (leftMarker <= rightMarker) {
            // Левый маркер будет меньше правого только если мы должны выполнить swap
            if (leftMarker < rightMarker) {
                int tmp = source[leftMarker];
                source[leftMarker] = source[rightMarker];
                source[rightMarker] = tmp;
            }
            // Сдвигаем маркеры, чтобы получить новые границы
            leftMarker++;
            rightMarker--;
        }
    } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
        quickSort(source, leftMarker, rightBorder);
    }
        if (leftBorder < rightMarker) {
        quickSort(source, leftBorder, rightMarker);
    }
}
}
