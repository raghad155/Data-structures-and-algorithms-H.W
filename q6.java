class Node<E> implements Position<E> {
    E element;
    Node<E> left, right, parent;

    public Node(E e, Node<E> parent) {
        this.element = e;
        this.parent = parent;
        this.left = null;
        this.right = null;
    }

    @Override
    public E getElement() {
        return element;
    }
}