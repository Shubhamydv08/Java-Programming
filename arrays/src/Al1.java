import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class Al1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        System.out.println("Enter the elment u want to search ");
        int t = sc.nextInt();
        for (int i = 0; i <5 ; i++) {
            if(t== list.get(i)) {
                System.out.println(list);
                break;
            } else {
                System.out.println("element not found");
                break;
            }

        }
    }
}
