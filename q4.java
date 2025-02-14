public class DoublyLinkedList<E> {
    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    public DoublyLinkedList() {
        header = new Node<>(null);
        trailer = new Node<>(null);
        header.next = trailer;
        trailer.prev = header;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public E first() {
        if (isEmpty()) return null;
        return header.next.element;
    }

    public E last() {
        if (isEmpty()) return null;
        return trailer.prev.element;
    }

    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next = header.next;
        newNode.prev = header;
        header.next.prev = newNode;
        header.next = newNode;
        size++;
    }

    public void addLast(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.prev = trailer.prev;
        newNode.next = trailer;
        trailer.prev.next = newNode;
        trailer.prev = newNode;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        Node<E> nodeToRemove = header.next;
        header.next = nodeToRemove.next;
        nodeToRemove.next.prev = header;
        size--;
        return nodeToRemove.element;
    }

    public E removeLast() {
        if (isEmpty()) return null;
        Node<E> nodeToRemove = trailer.prev;
        trailer.prev = nodeToRemove.prev;
        nodeToRemove.prev.next = trailer;
        size--;
        return nodeToRemove.element;
    }
    public Node<E> findMiddle() {
    Node<E> slow = header.next; // يبدأ من العنصر الأول
    Node<E> fast = header.next; // يبدأ من العنصر الأول

    while (fast != trailer && fast.next != trailer) {
        slow = slow.next; // خطوة واحدة
        fast = fast.next.next; // خطوتان
    }
    return slow; // إرجاع العقدة الوسطى
}
}