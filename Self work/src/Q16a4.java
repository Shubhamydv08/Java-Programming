import java.util.*;
public class Q16a4 {

	public static void main(String[] args) {
		
		System.out.println("Enter the character");
		Scanner sc = new Scanner(System.in);
		char x = sc.next().charAt(0);
		if (x >= 65&&x<=90) {
			System.out.println("The character is an uppercase.");
		} else if(x >= 97 && x<=122) {
			System.out.println("The character is an lower case.");
		} else if(x>=48&&x<=57) {
			System.out.println("It is a digit.");
		} else if((x>=0&&x<=47)||(x>=58&&x<=64)||(x>=91&&x<=96)||(x>=123&&x<=127)){
			System.out.println("It is a special character.");
			
		}
		

	}

}
