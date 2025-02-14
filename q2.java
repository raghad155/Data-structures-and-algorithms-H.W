public class ArrayStack<E> implements Stack<E> {
    private E[] data;
    private int topIndex = -1;

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public int size() {
        return topIndex + 1;
    }

    public E top() {
        if (isEmpty()) return null;
        return data[topIndex];
    }

    public void push(E e) {
        if (size() == data.length) throw new IllegalStateException("Stack is full");
        data[++topIndex] = e;
    }

    public E pop() {
        if (isEmpty()) return null;
        E element = data[topIndex];
        data[topIndex--] = null; // إزالة العنصر
        return element;
    }
}