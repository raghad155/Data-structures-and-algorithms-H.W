import java.util.Iterator;

class PositionalListIterator<E> implements Iterator<E> {
    private Position<E> current;
    private PositionalList<E> list;

    public PositionalListIterator(PositionalList<E> list) {
        this.list = list;
        this.current = list.first();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public E next() {
        E element = current.getElement();
        current = list.after(current);
        return element;
    }
}

class LinkedPositionalListWithIterator<E> extends LinkedPositionalList<E> implements Iterable<E> {
    @Override
    public Iterator<E> iterator() {
        return new PositionalListIterator<>(this);
    }
}