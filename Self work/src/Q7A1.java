import java.util.*;

public class Q7A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();
		//if(button == 1) {
		//	System.out.println("hello");
		//} else  if(button == 2) {
		//	System.out.println("namaste");
		//} else if(button == 3) {
		//	System.out.println("bonjour");
		//} else {
		//	System.out.println("invalid input");
		//}
		switch(button ) {
		case 1 : System.out.println("hello");
		break;
		case 2 : System.out.println("Namaste");
		break;
		case 3 : System.out.println("Bonjour");
		break;
		default : System.out.println("invalid input");
		}

	}

}
