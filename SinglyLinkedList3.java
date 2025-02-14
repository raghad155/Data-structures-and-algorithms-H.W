/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
public class SinglyLinkedList3<E> {
    private Node<E> head;

    // ... باقي طرق الفئة

    public int size() {
        int count = 0;
        Node<E> current = head;

        while (current != null) {
            count++;
            current = (Node<E>) current.next;
        }

        return count;
    }
}