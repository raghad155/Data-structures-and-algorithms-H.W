public class ArrayQueue<E> implements Queue<E> {
    private E[] data;
    private int front = 0;
    private int rear = 0;
    private int size = 0;

    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public E first() {
        if (isEmpty()) return null;
        return data[front];
    }

    public void enqueue(E e) {
        if (size == data.length) throw new IllegalStateException("Queue is full");
        data[rear] = e;
        rear = (rear + 1) % data.length;
        size++;
    }

    public E dequeue() {
        if (isEmpty()) return null;
        E element = data[front];
        data[front] = null; // إزالة العنصر
        front = (front + 1) % data.length;
        size--;
        return element;
    }
}