/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

public class SinglyLinkedList2<E> {
    private Node<E> head;

    // ... باقي طرق الفئة

    public Node<E> getSecondToLastNode() {
        // تحقق من حالة القائمة الفارغة أو التي تحتوي على عقدة واحدة
        if (head == null || head.next == null) {
            return null;
        }

        // متغيرين مؤقتين: current يشير إلى العقدة الحالية، previous يشير إلى العقدة السابقة
        Node<E> current = head;
        Node<E> previous = null;

        // نمر على العقد حتى نصل إلى نهاية القائمة
        while (current.next != null) {
            previous = current; // نحفظ العقدة الحالية كعقدة سابقة
            current = (Node<E>) current.next; // ننتقل إلى العقدة التالية
        }

        // عند الخروج من الحلقة، يكون previous يشير إلى العقدة قبل الأخيرة
        return previous;
    }}
