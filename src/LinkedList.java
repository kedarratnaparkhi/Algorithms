
public class LinkedList {

    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode();
        LinkedListNode middle = new LinkedListNode();
        LinkedListNode last = new LinkedListNode();

        head.data = 10;
        head.next = middle;

        middle.data = 20;
        middle.next = last;

        last.data = 30;
        last.next = null;

        LinkedListNode temp = head;
        while(temp != null){
            System.out.println(temp.data+"\n");
            temp = temp.next;
        }
    }
}

class LinkedListNode{
    int data;
    LinkedListNode next;
}
