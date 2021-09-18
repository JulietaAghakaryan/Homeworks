package Week7.ex8;

public class SafeImpl<T> implements SimpleList<T> {

    private final T[] array;
    private final int maxCapacity = 10000;
    private int index = 0;

    public SafeImpl() {
        array = (T[]) new Object[maxCapacity];
    }

    @Override
    public synchronized void add(T item) {
        if (index <= maxCapacity) {
            array[index] = item;
            index++;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public synchronized int getSize() {
        return index;
    }

    @Override
    public synchronized T get(int index) {
        System.out.println(array[index] + " " + index);
        return array[index];
    }
}
