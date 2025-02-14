/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
class Node1 {
    int data;
    Node next;

    // Constructor
    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList5 {
    Node head;

    public static Node concatenateLists(Node L, Node M) {
        if (L == null) {
            return M;
        }
        if (M == null) {
            return L;
        }

        Node current = L;
        while (current.next != null) {
            current = (Node) current.next;
        }

        current.next = M;

        return L;
    }

    // Helper function to display a linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = (Node) current.next;
        }
        System.out.println("null");
    }

    // Main method to test the concatenation
    public static void main(String[] args) {
        // Create first linked list L: 1 -> 2 -> 3
        Node L = new Node(1);
        L.next = new Node(2);
        L.next.next = new Node(3);

        // Create second linked list M: 4 -> 5 -> 6
        Node M = new Node(4);
        M.next = new Node(5);
        M.next.next = new Node(6);

        // Print the original lists
        System.out.println("List L:");
        printList(L);
        System.out.println("List M:");
        printList(M);

        // Concatenate the lists
        Node LPrime = concatenateLists(L, M);

        // Print the concatenated list
        System.out.println("Concatenated List L':");
        printList(LPrime);
    }
}
