public DoublyLinkedList<E> clone() {
    DoublyLinkedList<E> clone = new DoublyLinkedList<>();
    Node<E> current = this.header.next;

    while (current != trailer) {
        clone.addLast(current.element);
        current = current.next;
    }
    return clone;
}