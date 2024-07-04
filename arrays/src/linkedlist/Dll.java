package linkedlist;

public class Dll {
    Node head;
    Node tail;
    class Node{
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    void ins_first(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    void ins_last(int val) {
        Node node = new Node(val);
        if(tail == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
    }
    void del_first(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        head= head.next;
         head.prev=null;
    }
    void del_last(){
        if(tail==null){
            System.out.println("List is Empty");
            return;
        }
        tail=tail.prev;
        tail.next=null;
    }

    void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + "<->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        Dll list = new Dll();
        list.ins_first(5);
        list.ins_first(4);
        list.ins_first(3);
        list.display();
        list.ins_last(6);
        list.ins_last(12);
        list.display();
        list.del_first();
        list.display();
        list.del_last();
        list.display();

    }
}
