package Lecture1;

import java.util.Scanner;

public class LL {
    Scanner in = new Scanner(System.in);
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    //add_first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add_Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node tempNode = head;                                                                 
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }
    //del first
    public void deleteFirst() {
        if(head == null) {
            System.out.println("This is empty list");
            return;
        }
        head=head.next;
    }
    // del last
    public void deleteLast() {
        if(head == null) {
            System.out.println("This is empty list");
            return;
        }
        if(head.next==null) {
            head=null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next!=null) {
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;

    }

    //insert at any position
    public void insert(int index, int val) {
        Node node = new Node(val);
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    //delete at any position
    public void deleteAny(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }


    //print
    public void printList() {
        if(head == null){
            System.out.print("list is empty");
            return;
        }
        Node tempNode = head;
        while(tempNode !=null) {
            System.out.print(tempNode.data+ "-> ");
            tempNode=tempNode.next;
        }
        System.out.println("End");
    }



}
