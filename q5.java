public int size() {
    int count = 0;
    Node<E> current = head;
    while (current != null) {
        count++;
        current = current.next;
    }
    return count;
}