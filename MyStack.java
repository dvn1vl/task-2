import java.util.EmptyStackException;

public class MyStack<E> {
    private MyList<E> list;

    public MyStack(MyList<E> list) {
        this.list = list;
    }
//pushing element in the end
    public void push(E element) {
        list.add(element);
    }
//deleting the element from the end
    public E pop() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(list.size() - 1);
    }
    //getting the element in the end

    public E peek() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}