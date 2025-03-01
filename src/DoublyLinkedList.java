public class DoublyLinkedList {
    Node head; // Points to the first node

    // Inner Node class
    static class Node {
        String data;
        Node next; // Points to the next node
        Node prev; // Points to the previous node

        // Constructor
        Node(String newData) {
            data = newData;
            next = null;
            prev = null;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList(); // Creates an empty doubly linked list

        // Creating nodes
        Node tom = new Node("Tom");
        Node dick = new Node("Dick");
        Node harry = new Node("Harry");
        Node sam = new Node("Sam");
        Node bill = new Node("Bill");
        Node sue = new Node("Sue");

        // Connecting nodes in a doubly linked manner
        list.head = bill; // Setting the head

        bill.next = tom;
        tom.prev = bill; // Linking backward

        tom.next = dick;
        dick.prev = tom;

        dick.next = harry;
        harry.prev = dick;

        // Inserting Sue before Sam
        harry.next = sue;
        sue.prev = harry;

        sue.next = sam;
        sam.prev = sue;

        // Going forwards
        System.out.println("\nGoing Forward:");
        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

        // Move to the last node
        Node last = list.head;
        while (last.next != null) {
            last = last.next;
        }

        // Going Backwards
        System.out.println("\nGoing Backward:");
        while (last != null) {
            System.out.print(last.data + " <- ");
            last = last.prev;
        }
        System.out.println("null");
    }
}
