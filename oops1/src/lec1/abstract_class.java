package lec1;


import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

abstract class Parent{
    public Parent(){
        System.out.println("Mai Parent ka cunstroctor hun");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child extends Parent{
    public void greet(){
        System.out.println("Good morning");
    }
    public void greet2(){
        System.out.println("namashkar");
    }

}
abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}

public class abstract_class {
    public static void main(String[] args){
        Child ch = new Child();
        System.out.println(ch);
        System.out.println(ch);



    }
}
