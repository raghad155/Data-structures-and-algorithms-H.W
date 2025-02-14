public ArrayQueue<E> clone() {
    ArrayQueue<E> clone = new ArrayQueue<>(data.length);
    for (int i = 0; i < size; i++) {
        clone.enqueue(data[(front + i) % data.length]);
    }
    return clone;
}