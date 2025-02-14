class ArrayList<E> {
    private E[] data;
    private int size;

    public ArrayList(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public void add(E e) {
        if (size == data.length) throw new IllegalStateException("Array is full");
        data[size++] = e;
    }

    public E get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index out of bounds");
        return data[index];
    }

    public int size() {
        return size;
    }
}