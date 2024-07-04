package loops;

public class Searchmaximum {

	public static void main(String[] args) {
		int[] arr = {7,76,81,90,80};
		System.out.println(max(arr));
		//System.out.println(min(arr));
	}
	public static int max(int[] arr) {
		int ans=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>ans) {
				ans=arr[i];
			}
		}
		return ans;
	}
//	static int min(int[] arr) {
//		int ans = arr[0];
//		for(int i =1; i<arr.length; i++) {
//			if(arr[i]<ans) {
//				ans= arr[i];
//			}
//		}
//		return ans;
//	}
}
