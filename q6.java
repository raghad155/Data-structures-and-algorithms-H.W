public void clear(LinkedStack<E> stack) {
    if (!stack.isEmpty()) {
        stack.pop(); 
        clear(stack); 
    }
}