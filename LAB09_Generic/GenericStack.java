
public class GenericStack<E> {
    private E[] list;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public GenericStack() {
        list = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E peek() {
        if (isEmpty()) {
            return null; 
        }
        return list[size - 1];
    }

    public void push(E o) {
        if (size >= list.length) {
            E[] newList = (E[]) new Object[list.length * 2];
            System.arraycopy(list, 0, newList, 0, list.length);
            list = newList;
        }
        list[size++] = o;
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E o = list[--size];
        list[size] = null; // Help garbage collector
        return o;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("stack: [");
        for (int i = 0; i < size; i++) {
            sb.append(list[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
