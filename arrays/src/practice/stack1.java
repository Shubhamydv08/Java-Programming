package practice;

import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.isEmpty());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);

    }
}
