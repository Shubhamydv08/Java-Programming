package Assignment2;
import java.util.Scanner;
class Q3Student {
    int rollNo;
    String name;
    String course;
    void input_student(int rollNo,String name,String course) {
        this.rollNo= rollNo;
        this.name=name;
        this.course=course;
    }
    void display_student(){
        System.out.println("Name :"+name);
        System.out.println("roll number = "+ rollNo);
        System.out.println(" course ="+course);
    }

}
class Exam extends Q3Student {
    int mark1, mark2, mark3;
    void input_Marks (int mark1,int mark2,int mark3) {
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }
   void display_Result () {
       System.out.println("Marks 1 ="+mark1);
       System.out.println("Marks 2 = "+mark2);
       System.out.println(" Marks 3 ="+mark3);
    }

}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exam ob[] = new Exam[5];
        for (int i = 0; i < 5; i++) {
            ob[i]=new Exam();
        }
        for (int i = 0; i < 5; i++) {

            System.out.println("For Student 1 :");
            System.out.println("Enter Student Name :");
            String name=sc.nextLine();
            System.out.println("Enter Roll Number :");
            int roll_number=sc.nextInt();
            System.out.println("Enter Course :");
            String course = sc.nextLine();
            System.out.println("Enter Mark 1 :");
            int mark1=sc.nextInt();
            System.out.println("Enter Mark 2 :");
            int mark2=sc.nextInt();
            System.out.println("Enter Mark 3 :");
            int mark3=sc.nextInt();
            sc.nextLine();
            ob[i].input_student(roll_number,name,course);
            ob[i].input_Marks(mark1, mark2, mark3);

        }
        System.out.println("Displaying result :/n/n");
        for (int i = 0; i <5 ; i++) {
            ob[i].display_student();
            ob[i].display_Result();
        }

    }
}
