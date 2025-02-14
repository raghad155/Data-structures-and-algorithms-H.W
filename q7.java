public class SingleSentinelDoublyLinkedList<E> {
    private Node<E> sentinel;
    private int size = 0;

    public SingleSentinelDoublyLinkedList() {
        sentinel = new Node<>(null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next = sentinel.next;
        newNode.prev = sentinel;
        sentinel.next.prev = newNode;
        sentinel.next = newNode;
        size++;
    }

    public void addLast(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.prev = sentinel.prev;
        newNode.next = sentinel;
        sentinel.prev.next = newNode;
        sentinel.prev = newNode;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        Node<E> nodeToRemove = sentinel.next;
        sentinel.next = nodeToRemove.next;
        nodeToRemove.next.prev = sentinel;
        size--;
        return nodeToRemove.element;
    }

    public E removeLast() {
        if (isEmpty()) return null;
        Node<E> nodeToRemove = sentinel.prev;
        sentinel.prev = nodeToRemove.prev;
        nodeToRemove.prev.next = sentinel;
        size--;
        return nodeToRemove.element;
    }
}