boolean search(Node root, int key) {
    if (root == null) {
        return false;
    }
    if (root.data == key) {
        return true;
    }
    return key < root.data ? search(root.left, key) : search(root.right, key);
}

// استخدام البحث
int key = 5;
System.out.println("Search for " + key + ": " + search(tree.root, key)); // true أو false حسب القيمة