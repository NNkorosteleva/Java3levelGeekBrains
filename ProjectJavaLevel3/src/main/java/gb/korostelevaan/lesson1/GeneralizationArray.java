package gb.korostelevaan.lesson1;

import java.util.ArrayList;
import java.util.Collections;

public class GeneralizationArray<V> {
    private V[] array;

    public GeneralizationArray(V... array) {
        this.array = array;
    }

    /**
     * Метод, который меняет два элемента массива местами
     *
     * @param index1 индекс массива
     * @param index2 индекс массива
     * @return массив в котором значения 2х индексов переставлены местами
     */
    public V[] swap(int index1, int index2) {
        if (index1 >= 0 && index1 < size() && index2 >= 0 && index2 < size()) {
            V temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array;
    }

    /**
     * Метод, который преобразует массив в ArrayList
     *
     * @return ArrayList
     */
    public ArrayList<V> toArrayList(){
        ArrayList<V> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,array);
        return arrayList;
    }

    /**
     * Метод выводит на экран массив
     */
    public void printArray(){
        for (int i = 0; i < size(); i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * Возвращает длину массива
     *
     * @return длина массива
     */
    private int size() {
        return array.length;
    }
}
