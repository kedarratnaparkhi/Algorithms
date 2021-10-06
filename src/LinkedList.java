
public class LinkedList {

    public static void main(String[] args) {
        Node head = new Node();
        Node middle = new Node();
        Node last = new Node();

        head.data = 10;
        head.next = middle;

        middle.data = 20;
        middle.next = last;

        last.data = 30;
        last.next = null;

        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+"\n");
            temp = temp.next;
        }
    }
}

class Node{
    int data;
    Node next;
}
