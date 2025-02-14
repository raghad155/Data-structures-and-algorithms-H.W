int sumOfNodes(Node node) {
    if (node == null) {
        return 0;
    }
    return node.data + sumOfNodes(node.left) + sumOfNodes(node.right);
}

// استخدام الدالة
System.out.println("Sum of all nodes: " + sumOfNodes(tree.root)); // 15