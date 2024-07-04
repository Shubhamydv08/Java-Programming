package loops;

public class Searchminimum {

	public static void main(String[] args) {
		int [] arr = {9,82,8,5,0} ;
		System.out.println(min(arr));
	}
	static int min(int[] arr) {
		int ans = arr[0];
		for(int i =1; i<arr.length; i++) {
			if(arr[i]<ans) {
				ans= arr[i];
			}
		}
		return ans;
	}

}
