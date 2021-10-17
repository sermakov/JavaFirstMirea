package ru.mirea.task13.opt3;

import java.util.Arrays;
import java.util.Comparator;

public class MyCollection <T>{
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 2;
    private Object[] array = new Object[INIT_SIZE];
    private int count = 0;

    /*
      Добавляет новый элемент в список. При достижении размера внутреннего
      массива происходит его увеличение в два раза.
      */
    public void add(T item){
        if(count == array.length-1) resize(array.length*2);;
        array[count++] = item;
    }

    /*
    Сортирует список по возрастанию значений элементов.
    */
    public void sort(Comparator<? super Object> comp){
        //Arrays.sort(array, comp); // java.lang.NullPointerException
        for (int i = 1; i < count; i++) {
            boolean ch = false;
            for(int j = count-1; j > i; j--){
                if(comp.compare(array[j], array[j-1]) < 0){
                    Object tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                    ch = true;
                }
            }
            if(!ch) break;
        }
    }

    /*
      Удаляет элемент списка по индексу. Все элементы справа от удаляемого
      перемещаются на шаг налево. Если после удаления элемента количество
      элементов стало в CUT_RATE раз меньше чем размер внутреннего массива,
      то внутренний массив уменьшается в два раза, для экономии занимаемого
      места.
      */
    public void remove(int index) {
        if (index < 0 || index >= count) return;

        for (int i = index; i<count; i++)
            array[i] = array[i+1];
        array[count] = null;
        count--;
        if (array.length > INIT_SIZE && count < array.length / CUT_RATE)
            resize(array.length/2);
    }

    /*
       Возвращает элемент списка по индексу.
       */
    public T get(int index){
        return (T) array[index];
    }
    /*
    Возвращает индекс первого вхожения элемента в список. Если искомого
    элемента в списке нет, возвращает -1.
     */
    public int indexOf(T o){
        for(int i = 0; i < count; i++)
            if(array[i].equals(o)) return i;
        return -1;
    }

    /*
       Возвращает индекс последнего вхожения элемента в список. Если искомого
       элемента в списке нет, возвращает -1.
        */
    public int lastIndexOf(T o){
        for(int i = count-1; i >=0; i--)
            if(array[i].equals(o)) return i;
        return -1;
    }

    /*Возвращает количество элементов в списке*/
    public int getSize() {
        return count;
    }

    /*Вспомогательный метод для масштабирования.*/
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, count);
        array = newArray;
    }

    @Override
    public String toString() {
        return "MyCollection[" +
                "INIT_SIZE=" + INIT_SIZE +
                ", CUT_RATE=" + CUT_RATE +
                ", array=" + Arrays.toString(Arrays.stream(array).limit(count).toArray()) +
                ", count=" + count +
                ']';
    }
}
