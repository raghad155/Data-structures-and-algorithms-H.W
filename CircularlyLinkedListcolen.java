/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
public class CircularlyLinkedListcolen<E> {

    private Node<E> tail = null;
    private int size = 0;

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }
        public E getElement() { return element; }
        public Node<E> getNext() { return next; }
        public void setNext(Node<E> n) { next = n; }
    }

    // ... other methods (addFirst, addLast, removeFirst, etc.)

    public CircularlyLinkedList<E> clone() throws CloneNotSupportedException {
        CircularlyLinkedList<E> clonedList = new CircularlyLinkedList<>();
        if (this.size > 0) { // Only clone if the list is not empty
            Node<E> originalHead = this.tail.getNext();
            Node<E> clonedTail = null;
            Node<E> clonedHead = null;

            // Clone the first node to start the cloned list
            clonedHead = new Node<>(originalHead.getElement(), null);
            clonedList.tail = clonedHead;
            clonedTail = clonedHead;


            Node<E> originalCurrent = originalHead.getNext();

            for (int i = 1; i < this.size; i++) {
                Node<E> clonedCurrent = new Node<>(originalCurrent.getElement(), null);
                clonedTail.setNext(clonedCurrent);
                clonedTail = clonedCurrent;
                originalCurrent = originalCurrent.getNext();

            }
            clonedTail.setNext(clonedHead);
            clonedList.size = this.size;

        }
        return clonedList;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
      
}}