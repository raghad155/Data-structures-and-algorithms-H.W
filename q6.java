public void rotate() {
    if (isEmpty() || head.next == null) return;
    Node<E> oldHead = head;
    head = head.next;
    tail.next = oldHead;
    oldHead.next = null;
    tail = oldHead;
}