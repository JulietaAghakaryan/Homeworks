package Week7.ex8;

public interface SimpleList<T> {
    void add(T item);

    int getSize();

    T get(int index);
}
