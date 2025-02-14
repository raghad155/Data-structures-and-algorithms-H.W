/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
public class SinglyLinkedList4<E> {
    private Node<E> head;

    // ... باقي طرق الفئة

    public void rotate() {
        if (head == null || head.next == null) {
            return; // قائمة فارغة أو تحتوي على عقدة واحدة
        }

        Node<E> second = (Node<E>) head.next;
        head.next = null;
        head = second;

        Node<E> current = head;
        while (current.next != null) {
            current = (Node<E>) current.next;
        }
        current.next = head;
    }
}