package Lecture1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            LL list = new LL();
            System.out.println("** Menu  **");
            System.out.println("0: exit");
            System.out.println("1: insert at first position");
            System.out.println("2: insert at last");
            System.out.println("3: delete first");
            System.out.println("4: delete last");
            System.out.println("5: Insert at any position ");
            System.out.println("6: Delete at any position");
            System.out.println("7: Display the list");


            while(true) {
                System.out.println("Enter value 0 to 7 to run");
                int n = in.nextInt();
                switch (n) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        System.out.println("Enter a value to insert at first position");
                        int val = in.nextInt();
                        list.addFirst(val);
                        break;
                    case 2:
                        System.out.println("Enter a value to insert at last position");
                        int v = in.nextInt();
                        list.addLast(v);
                        break;
                    case 3:
                        System.out.println("Delete the first position");
                        list.deleteFirst();
                        break;
                    case 4:
                        System.out.println("Delete the last position");
                        list.deleteLast();
                        break;
                    case 5:
                        System.out.println("Enter index value to insert at");
                        int index = in.nextInt();
                        System.out.println("Enter value to insert at the index");
                        int value = in.nextInt();
                        list.insert(index, value);
                        break;

                    case 6:
                        System.out.println("Enter index value to delete");
                        int ind = in.nextInt();
                        list.deleteAny(ind);
                        break;
                    case 7:
                        list.printList();
                        break;
                default:
                    System.out.println("invalid choice");
                }
            }

        }

}
