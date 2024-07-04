package Staticexample;

public class innerclass {
     class Test{
        String name;
        public Test(String name) {
            this.name= name;
        }
    }

    public void main(String[] args) {
       Test a = new Test("Shubham");
        Test b = new Test("Arpita");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
