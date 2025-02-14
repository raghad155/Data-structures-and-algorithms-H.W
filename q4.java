public Node<E> findSecondToLast() {
    if (head == null || head.next == null) return null;
    Node<E> current = head;
    while (current.next.next != null) {
        current = current.next;
    }
    return current;
}