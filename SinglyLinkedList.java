/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;


public class SinglyLinkedList<E> {
    private Node<E> head;

    public boolean equals(SinglyLinkedList<E> other) {
        if (this == other) {
            return true; // نفس المرجع
        }
        if (other == null) {
            return false; // القائمة الأخرى فارغة
        }
        if (this.size() != other.size()) {
            return false; // أطوال مختلفة
        }

        Node<E> thisNode = this.head;
        Node<E> otherNode = other.head;
        while (thisNode != null && otherNode != null) {
            if (!thisNode.data.equals(otherNode.data)) {
                return false; // قيم مختلفة
            }
            thisNode = (Node<E>) thisNode.next;
            otherNode = (Node<E>) otherNode.next;
        }
        return true; // جميع العناصر متساوية
    }

    private boolean size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
