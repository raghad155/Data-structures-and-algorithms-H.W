public void concatenate(LinkedQueue<E> Q2) {
    if (Q2.isEmpty()) return;
    if (isEmpty()) {
        front = Q2.front;
        rear = Q2.rear;
    } else {
        rear.next = Q2.front;
        rear = Q2.rear; 
    }
    size += Q2.size;
    Q2.front = null; 
    Q2.rear = null;
    Q2.size = 0;
}