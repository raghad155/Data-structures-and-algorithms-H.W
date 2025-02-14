int findMin(Node root) {
    while (root.left != null) {
        root = root.left;
    }
    return root.data;
}

int findMax(Node root) {
    while (root.right != null) {
        root = root.right;
    }
    return root.data;
}

// استخدام الدوال
System.out.println("Minimum value: " + findMin(tree.root)); // 4
System.out.println("Maximum value: " + findMax(tree.root)); // 5