package Lecture1;
import java.util.Scanner;
public class CharacterU {
    boolean uniqueChar(String str) {
        for(int i = 0; i< str.length(); i++)
            for(int j = i+1; j<str.length();j++)
                if ( str.charAt(i) == str.charAt(j))
                    return false;

            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CharacterU ob = new CharacterU();
        System.out.println("enter the characters");
        String input = sc.next();
        if(ob.uniqueChar(input))
            System.out.println("The String " + input + " has all unique characters");
        else
            System.out.println("The String " + input + " has  duplicate characters");

    }
}
