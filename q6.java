int kthLargest(Node root, int k) {
    int[] count = {0};
    return kthLargestUtil(root, k, count);
}

int kthLargestUtil(Node root, int k, int[] count) {
    if (root == null) {
        return -1;
    }
    int right = kthLargestUtil(root.right, k, count);
    if (right != -1) {
        return right;
    }
    count[0]++;
    if (count[0] == k) {
        return root.data;
    }
    return kthLargestUtil(root.left, k, count);
}

// استخدام الدالة
int k = 2; // العثور على العنصر الأكبر الثاني
System.out.println("Kth Largest Element: " + kthLargest(tree.root, k)); // استبدل بالقيمة المناسبة