package linkedlist;
import java.sql.SQLOutput;
public class LL {
    Node head;
    class Node{
        int val;
        Node next ;
        Node(int val) {
            this.val=val;
        }
        Node (int val, Node next) {
            this.val=val;
            this.next=next;
        }
    }
    public void insret_first(int val) {
        Node node = new Node(val);
          if(head==null ){
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }
    public void insert_last(int val){
        Node node = new Node(val);
        if(head== null) {
            head= node;
            return;
        }
        Node last = head;
        while (last.next!=null){
            last=last.next;
        }
        last.next=node;
    }
    public void del_first(){
        Node temp = head;
        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        else{
            head = temp.next;
        }
    }
    public void del_last(){
        Node temp= head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        while(temp.next.next!=null){
          temp=temp.next;
        }
        temp.next=null;
    }
    public void insert_any(int val, int k){
        Node node = new Node(val);
        Node temp= head;
        int count =0;
        while (count<k){
            temp=temp.next;
            count++;
        }
        node.next=temp.next;
        temp.next=node;

    }
    public void del_any(int k){
        Node temp= head;
        int count =0;
        while (count<k-1){
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;
    }
    public void display () {
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp =head;
        while (temp!= null) {
            System.out.print(temp.val+"--->");
            temp= temp.next;
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        LL list= new LL();
        list.insret_first(1);
        list.insret_first(2);
        list.insret_first(3);
        list.insret_first(4);
        list.insert_last(5);
        list.display();
        list.del_first();
        list.display();
        list.del_last();
        list.display();
        list.insert_any(0,1);
        list.display();
        list.del_any(2);
        list.display();

    }
}