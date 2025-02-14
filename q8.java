public ArrayStack<E> clone() {
    ArrayStack<E> clone = new ArrayStack<>(data.length);
    for (int i = 0; i <= topIndex; i++) {
        clone.push(data[i]);
    }
    return clone;
}