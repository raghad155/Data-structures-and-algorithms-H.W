class Node<E> implements Position<E> {
    E element;
    Node<E> prev, next;

    public Node(E e) {
        this.element = e;
        this.prev = null;
        this.next = null;
    }

    @Override
    public E getElement() {
        return element;
    }
}

class LinkedPositionalList<E> implements PositionalList<E> {
    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    public LinkedPositionalList() {
        header = new Node<>(null); // رأس القائمة
        trailer = new Node<>(null); // ذيل القائمة
        header.next = trailer;
        trailer.prev = header;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Position<E> first() {
        return header.next != trailer ? header.next : null;
    }

    public Position<E> last() {
        return trailer.prev != header ? trailer.prev : null;
    }

    public Position<E> before(Position<E> p) {
        Node<E> node = validate(p);
        return node.prev != header ? node.prev : null;
    }

    public Position<E> after(Position<E> p) {
        Node<E> node = validate(p);
        return node.next != trailer ? node.next : null;
    }

    private Node<E> validate(Position<E> p) {
        if (!(p instanceof Node)) throw new IllegalArgumentException("Invalid position");
        return (Node<E>) p;
    }

    public void addFirst(E e) {
        addBetween(e, header, header.next);
    }

    public void addLast(E e) {
        addBetween(e, trailer.prev, trailer);
    }

    public void addBefore(Position<E> p, E e) {
        Node<E> node = validate(p);
        addBetween(e, node.prev, node);
    }

    public void addAfter(Position<E> p, E e) {
        Node<E> node = validate(p);
        addBetween(e, node, node.next);
    }

    private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
        Node<E> newNode = new Node<>(e);
        newNode.prev = predecessor;
        newNode.next = successor;
        predecessor.next = newNode;
        successor.prev = newNode;
        size++;
    }

    public E remove(Position<E> p) {
        Node<E> node = validate(p);
        Node<E> predecessor = node.prev;
        Node<E> successor = node.next;
        predecessor.next = successor;
        successor.prev = predecessor;
        size--;
        return node.getElement();
    }
}