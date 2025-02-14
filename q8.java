class ArrayBinaryTree<E> {
    private E[] tree;
    private int size;

    public ArrayBinaryTree(int capacity) {
        tree = (E[]) new Object[capacity];
        size = 0;
    }

    public void add(E e) {
        if (size >= tree.length) throw new IllegalStateException("Tree is full");
        tree[size++] = e;
    }

    public E get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index out of bounds");
        return tree[index];
    }

    public int leftChildIndex(int index) {
        return 2 * index + 1;
    }

    public int rightChildIndex(int index) {
        return 2 * index + 2;
    }

    public int parentIndex(int index) {
        return (index - 1) / 2;
    }

    public int size() {
        return size;
    }
}

// استخدام ArrayBinaryTree
ArrayBinaryTree<Integer> arrayTree = new ArrayBinaryTree<>(10);
arrayTree.add(1);
arrayTree.add(2);
arrayTree.add(3);
System.out.println("Size: " + arrayTree.size()); // 3
System.out.println("Element at index 1: " + arrayTree.get(1)); // 2