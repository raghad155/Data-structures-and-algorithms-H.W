class Node<E> {
    E element;
    Node<E> next;

    public Node(E e) {
        this.element = e;
        this.next = null;
    }
}

public class LinkedStack<E> implements Stack<E> {
    private Node<E> top;
    private int size = 0;

    public LinkedStack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public E top() {
        if (isEmpty()) return null;
        return top.element;
    }

    public void push(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public E pop() {
        if (isEmpty()) return null;
        E element = top.element;
        top = top.next;
        size--;
        return element;
    }
}