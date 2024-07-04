import java.util.*;
public class Q17A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int x = sc.nextInt();
	        if (n%2!=0) {
	            System.out.println("Weird");
	        } else if(x%2==0&&x>=2&&x<=5) {
	            System.out.println("Not Weird");
	        } else if(n%2==0&&n>=6&&n<=20) {
	            System.out.println("Weird");
	        } else if(x%2==0&&x>20) {
	            System.out.println("Not Weird");
	        }
	}

}
