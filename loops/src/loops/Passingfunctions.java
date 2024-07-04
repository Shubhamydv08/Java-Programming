package loops;

import java.util.Arrays;

public class Passingfunctions {

	public static void main(String[] args) {
		int shu[]= {4 ,5, 6, 7,8};
		System.out.println(Arrays.toString(shu));
		change(shu);
		System.out.println(Arrays.toString(shu));

	}
	static void change(int arr[]) {
		arr[4]= 99;
		
	}

}
