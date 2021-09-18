package Week7.ex8;

public class UnsafeImpl<T> implements SimpleList<T> {

    private final T[] array;
    private final int maxCapacity = 10000;
    private int index = 0;

    public UnsafeImpl() {
        array = (T[]) new Object[maxCapacity];
    }

    @Override
    public void add(T item) {
        if (index <= maxCapacity) {
            array[index] = item;
            index++;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int getSize() {
        return index;
    }

    @Override
    public T get(int index) {
        System.out.println(array[index] + " " + index);
        return array[index];
    }
}
