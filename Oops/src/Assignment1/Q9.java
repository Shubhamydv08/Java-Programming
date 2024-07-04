package Assignment1;
import java.util.Scanner;
public class Q9 {
    String name;
    int reg,marks;
    void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        this.name = sc.next();
        System.out.println("enter reg");
        this.reg= sc.nextInt();
        System.out.println("enter marks");
        this.marks=sc.nextInt();
    }
    void displayData() {
        System.out.println("name="+name+"  registration number"+reg+"  marks = "+marks);
    }

    public static void main(String[] args) {
        Q9 student1 = new Q9();
        Q9 student2 = new Q9();
        Q9 student3 = new Q9();

        student1.setData();
        student1.displayData();
        student2.setData();
        student2.displayData();
        student3.setData();
        student3.displayData();
    }
}
