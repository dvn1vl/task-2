import java.util.Iterator;
public interface MyList<E> {
    //adding methods here to override in linked list and array list
    void add(E element);
    void add(int index, E element);
    E get(int index);
    E remove(int index);
    int size();
    boolean isEmpty();
    boolean contains(E element);
    java.util.Iterator<E> iterator();
    void set(int index, E element);
}