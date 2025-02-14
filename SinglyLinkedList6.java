/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    // Function to reverse a linked list
    public static Node reverseList(Node head) {
        Node prev = null; // Previous node
        Node current = head; // Current node
        Node next = null; // Next node

        while (current != null) {
            // Save the next node
            next =
