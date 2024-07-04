package overloading;

public class Ex1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name= "Shubham";
        s1.name= "ram";
        s1.name= "Shubham";
        s1.age= 18;
        s1.printinfo(s1.name, s1.age);
        Student s2 = new Student();

        s2.age= 70;
        s1.printinfo(s2.name, s2.age);



    }
}
class Student{
    String name;
    int age;
    public void printinfo(String name) {
        System.out.println(name);

    }
    public void printinfo(int age) {
        System.out.println(age);
    }
    public void printinfo(String name , int age) {
        System.out.println(name + " " + age);
    }
}
