class Node<E> {
    E element;
    Node<E> prev;
    Node<E> next;

    public Node(E element) {
        this.element = element;
        this.prev = null;
        this.next = null;
    }
}