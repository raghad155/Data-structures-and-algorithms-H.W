public class LinkedBinaryTree<E> extends AbstractBinaryTree<E> {
    private Node<E> root;

    public LinkedBinaryTree() {
        root = null;
    }

    @Override
    public Position<E> root() {
        return root;
    }

    public Position<E> addRoot(E e) {
        if (root != null) throw new IllegalStateException("Tree is not empty");
        root = new Node<>(e, null);
        return root;
    }

    public Position<E> addLeft(Position<E> p, E e) {
        Node<E> parent = validate(p);
        if (parent.left != null) throw new IllegalArgumentException("Left child exists");
        Node<E> child = new Node<>(e, parent);
        parent.left = child;
        return child;
    }

    public Position<E> addRight(Position<E> p, E e) {
        Node<E> parent = validate(p);
        if (parent.right != null) throw new IllegalArgumentException("Right child exists");
        Node<E> child = new Node<>(e, parent);
        parent.right = child;
        return child;
    }

    public void set(Position<E> p, E e) {
        Node<E> node = validate(p);
        node.element = e;
    }

    public E remove(Position<E> p) {
        Node<E> node = validate(p);
        if (node.left != null && node.right != null) throw new IllegalArgumentException("Node has two children");
        Node<E> child = (node.left != null) ? node.left : node.right;

        if (child != null) {
            child.parent = node.parent;
        }

        if (node == root) {
            root = child;
        } else {
            Node<E> parent = node.parent;
            if (node == parent.left) {
                parent.left = child;
            } else {
                parent.right = child;
            }
        }
        return node.element;
    }

    private Node<E> validate(Position<E> p) {
        if (!(p instanceof Node)) throw new IllegalArgumentException("Invalid position");
        return (Node<E>) p;
    }

    @Override
    public int size() {
        return size(root);
    }

    private int size(Node<E> node) {
        if (node == null) return 0;
        return 1 + size(node.left) + size(node.right);
    }
}