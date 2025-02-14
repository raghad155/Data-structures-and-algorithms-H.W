public boolean equals(SinglyLinkedList<E> other) {
    if (this.size() != other.size()) return false;
    Node<E> currentA = this.head;
    Node<E> currentB = other.head;

    while (currentA != null) {
        if (!currentA.element.equals(currentB.element)) {
            return false;
        }
        currentA = currentA.next;
        currentB = currentB.next;
    }
    return true;
}