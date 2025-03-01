public class SimpleListNode {
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
        SimpleListNode list = new SimpleListNode(); //Makes an empty linked list
        //Inserting 4 nodes with data
        Node tom = new Node("Tom");
        Node dick = new Node("Dick");
        Node harry = new Node("Harry");
        Node sam = new Node("Sam");
        Node bill = new Node("Bill");
        Node sue = new Node("Sue");

        list.head = bill;

        bill.next = tom;//Linked 1st to 2nd and so on
        tom.next = dick;
        dick.next = harry;
        sue.next = harry.next;//Inserting Sue before Sam
        harry.next = sue;
        sue.next = sam;

        System.out.println("\nExercise a and b");
        System.out.println(bill.data);
        System.out.println(bill.next.data);
        System.out.println(bill.next.next.data);
        System.out.println(bill.next.next.next.data);
        System.out.println(bill.next.next.next.next.data);
        System.out.println(bill.next.next.next.next.next.data);

        System.out.println("\nOther way to print by using head");
        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);
        System.out.println(list.head.next.next.next.data);
        System.out.println(list.head.next.next.next.next.data);
        System.out.println(list.head.next.next.next.next.next.data);

        System.out.println("\n==========================================");

        list.head = tom;

        tom.next = dick;
        dick.next = sue;
        sue.next = null;

        System.out.println("\nExercise c d and e");
        System.out.println(tom.data);
        System.out.println(tom.next.data);
        System.out.println(tom.next.next.data);
    }
}