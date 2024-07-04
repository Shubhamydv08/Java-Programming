package Lecture1;
public class Q1 {
    public static void main(String[] args) {
        Student kunal = new Student(18, "shubham kumar",88.5f);
        Student student2 = new Student(19,"RAhul",95.5f);
        //System.out.println(greeting());
        kunal.greeting();

        System.out.println(kunal.roll);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
        student2.greeting();
        System.out.println(student2.roll);
        System.out.println(student2.name);
        System.out.println(student2.marks);
        Student random =new Student();
        System.out.println(random.name);
    }
}
class Student {

    int roll;
    String name;
    float marks;

     void greeting() {
         System.out.println("hello! my name is "+this.name);
     }
     Student () {
         this(18,"Default",100.0f);
     }
     void changename(String name) {
         this.name = name;
     }
    Student(int roll,String name,float marks) {
        this.roll = roll;
        this.name= name;
        this.marks=marks;
    }
}