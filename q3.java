class Node<E> {
    E element;
    Node<E> next;

    public Node(E e) {
        this.element = e;
        this.next = null;
    }
}

public class LinkedQueue<E> implements Queue<E> {
    private Node<E> front;
    private Node<E> rear;
    private int size = 0;

    public LinkedQueue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public E first() {
        if (isEmpty()) return null;
        return front.element;
    }

    public void enqueue(E e) {
        Node<E> newNode = new Node<>(e);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    public E dequeue() {
        if (isEmpty()) return null;
        E element = front.element;
        front = front.next;
        size--;
        if (isEmpty()) rear = null; // إذا كانت الطابور فارغة
        return element;
    }
}