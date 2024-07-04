package linkedlist;

public class LL1 {
    Node head;
    public class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
        public  void insert_first(int val){
            Node node = new Node(val);
            if(head==null) {
                head=node;
                return;
            }
            node.next=head;
            head=node;
        }
        public void insert_last(int val){
        Node node = new Node(val);
        if(head==null){
            head = node ;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next=node;
        }
        public void del_first() {
        Node temp = head;
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        head = temp.next;
        }
        public void display() {
            if (head==null){
                System.out.println("List is empty");
                return;
            }
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.val+"-->");
                temp=temp.next;
            }
            System.out.println("END");
        }
    public static void main(String[] args) {
        LL1 list = new LL1();
        list.insert_first(1);
        list.insert_first(2);
        list.insert_first(3);
        list.insert_last(0);
        list.del_first();
        list.display();
    }
}
