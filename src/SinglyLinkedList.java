public class SinglyLinkedList {
    Node head;

    static class Node{
        String data;
        Node next;

        //Constructor
        Node(String newData){
            data = newData;
            next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList(); //Makes an empty linked list
        //Inserting 4 nodes with data
        Node nicky = new Node("Nicky");
        Node dicky = new Node("Dicky");
        Node ricky = new Node("Ricky");
        Node dawn = new Node("Dawn");

        list.head = nicky;

        nicky.next = dicky;//Linked 1st to 2nd and so on
        dicky.next = ricky;
        ricky.next = dawn;

        System.out.println("\nPrinting the output");
        System.out.println(nicky.data);
        System.out.println(nicky.next.data);
        System.out.println(nicky.next.next.data);
        System.out.println(nicky.next.next.next.data);
    }
}