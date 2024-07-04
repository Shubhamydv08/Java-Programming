import java.util.*;
public class QE {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("enter a");
		int a =in.nextInt();
		int q =0;
		if(a>=2)
		{
		while(a>=2)
		 a =a/2;
		q++;
		System.out.println(q);
		}

	}

}
