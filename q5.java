public void rotate() {
    if (!isEmpty()) {
        E temp = dequeue(); 
        enqueue(temp); // إضافة العنصر إلى النهاية
    }
}