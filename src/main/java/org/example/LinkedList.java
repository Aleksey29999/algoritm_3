package org.example;

class LinkedList {
    private static Node head;
    private static Node tail;
    private int value;

    static class Node {
        Node previous;
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
            this.previous = null;
        }

        public int getValue() {
            return value;
        }
    }

    public class DoublyLinkedList {
        Node head;
        Node tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }
    }

    public static void insertAtBeginning(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head.previous = temp;
            head = temp;
        }
    }

    public static void revert() {
        Node node = head;
        Node temp = head;
        head = tail;
        tail = temp;
        while (node != null) {
            temp = node.next;
            node.next = node.previous;
            node.previous = temp;
            node = node.previous;
        }
    }

    public static void printList(Node node) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.getValue() + " —> ");
            ptr = ptr.next;

        }

        System.out.println("null");
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        insertAtBeginning(1);
        insertAtBeginning(2);
        insertAtBeginning(3);
        insertAtBeginning(4);
        insertAtBeginning(5);
        insertAtBeginning(6);
        insertAtBeginning(7);
        insertAtBeginning(8);

        printList(head);
        revert();
        printList(head);
    }
}
