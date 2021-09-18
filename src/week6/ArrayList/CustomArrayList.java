package week6.ArrayList;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CustomArrayList<T> {

    private final int maxArrayCapacity = 1000;
    private int arrayCapacity = 0;
    private int arraySize = 0;
    private T[] arrayList = (T[]) new Object[arraySize];

    public static void main(String[] args) {
        CustomArrayList<Integer> array = new CustomArrayList<>();
        array.addElementAtTheBeginning(5);
        array.addElementAtTheBeginning(4);
        array.addElementAtTheBeginning(3);
        array.addElementAtTheBeginning(1);
        array.addElementAtGivenIndex(2, 1);
        array.addElementAtGivenIndex(9, 1);
        array.addEelemtAtTheEnd(10);
        array.deleteElement(9);
        System.out.println(array.toString());
        System.out.println(array.search(3));

    }

    public int getArraySize() {
        return arraySize;
    }

    public T[] getArrayList() {
        return arrayList;
    }

    public void expand() {

        T[] copy = (T[]) new Object[arrayList.length + 1];
        System.arraycopy(arrayList, 0, copy, 0, arrayList.length);
        arrayList = copy;
        arraySize += 1;
    }

    public void addElementAtTheBeginning(T element) {
        if (arrayList.length == maxArrayCapacity) {
            throw new IndexOutOfBoundsException();
        }
        expand();
        for (int i = arrayList.length - 2; i >= 0; i--) {
            arrayList[i + 1] = arrayList[i];
        }
        arrayList[0] = element;
    }

    public void addElementAtGivenIndex(T element, int index) {
        if (arrayList.length == maxArrayCapacity || index > arraySize + 1) {
            throw new IndexOutOfBoundsException();
        }
        expand();
        for (int i = arrayList.length - 2; i >= index; i--) {
            arrayList[i + 1] = arrayList[i];
        }
        arrayList[index] = element;
    }

    public void addEelemtAtTheEnd(T element) {
        if (arrayList.length == maxArrayCapacity) {
            throw new IndexOutOfBoundsException();
        }
        expand();
        arrayList[arraySize - 1] = element;
    }

    public void deleteElement(T element) {
        for (int i = 0; i < arraySize; i++) {
            if (arrayList[i] == element) {
                T[] copy = (T[]) new Object[arraySize - 1];
                System.arraycopy(arrayList, 0, copy, 0, i);
                System.arraycopy(arrayList, i + 1, copy, i, arraySize - i - 1);
                arrayList = copy;

                arraySize--;
            }

        }
    }

    public void deleteElementAtGivenPosition(int i) {
        if (i > maxArrayCapacity || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        T[] copy = (T[]) new Object[arraySize - 1];
        System.arraycopy(arrayList, 0, copy, 0, i);
        System.arraycopy(arrayList, i + 1, copy, i, arraySize - i - 1);
        arrayList = copy;
    }

    public int search(T element) {
        for (int i = 0; i < arraySize; i++) {
            if (arrayList[i] == element) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arrayCapacity=" + arrayCapacity +
                ", maxArrayCapacity=" + maxArrayCapacity +
                ", arraySize=" + arraySize +
                ", arrayList=" + Arrays.toString(arrayList) +
                '}';
    }


}
