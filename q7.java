class ArrayListIterator<E> implements Iterator<E> {
    private ArrayList<E> list;
    private int currentIndex;

    public ArrayListIterator(ArrayList<E> list) {
        this.list = list;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public E next() {
        return list.get(currentIndex++);
    }
}

// إضافة الـ Iterable إلى ArrayList
class ArrayListWithIterator<E> extends ArrayList<E> implements Iterable<E> {
    @Override
    public Iterator<E> iterator() {
        return new ArrayListIterator<>(this);
    }
}