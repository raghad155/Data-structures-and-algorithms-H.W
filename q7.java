public SinglyLinkedList<E> concatenate(SinglyLinkedList<E> other) {
    SinglyLinkedList<E> result = new SinglyLinkedList<>();
    Node<E> current = this.head;

    while (current != null) {
        result.addLast(current.element);
        current = current.next;
    }

    current = other.head;
    while (current != null) {
        result.addLast(current.element);
        current = current.next;
    }

    return result;
}