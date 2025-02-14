void boundaryTraversal(Node node) {
    if (node == null) {
        return;
    }
    System.out.print(node.data + " "); // الطباعة للعقدة الجذرية
    printLeftBoundary(node.left);
    printLeaves(node);
    printRightBoundary(node.right);
}

void printLeftBoundary(Node node) {
    if (node != null) {
        if (node.left != null) {
            System.out.print(node.data + " ");
            printLeftBoundary(node.left);
        } else if (node.right != null) {
            System.out.print(node.data + " ");
            printLeftBoundary(node.right);
        }
    }
}

void printLeaves(Node node) {
    if (node != null) {
        printLeaves(node.left);
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }
        printLeaves(node.right);
    }
}

void printRightBoundary(Node node) {
    if (node != null) {
        if (node.right != null) {
            printRightBoundary(node.right);
            System.out.print(node.data + " ");
        } else if (node.left != null) {
            printRightBoundary(node.left);
            System.out.print(node.data + " ");
        }
    }
}

// استخدام الدالة
System.out.println("Boundary Traversal:");
boundaryTraversal(tree.root);