public void reverse() {
    Node<E> prev = null;
    Node<E> current = head;
    tail = head;

    while (current != null) {
        Node<E> next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    head = prev;
}