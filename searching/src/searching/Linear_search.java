package searching;

public class Linear_search {
	public static int linearsearch(int arr[] , int n , int val ) {
		for(int i = 0; i< n ; i ++) {
			if( arr [i]== val)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr [] = {8 ,7,2,2,3,1 } ;
		int x = 1;
		int result = linearsearch(arr ,arr.length,x);
		if(result == -1) {
			System.out.println("Element is not present in the array");
		}else {
			System.out.println("Element is present at the index no. :- "+result);
		}

	}

}
