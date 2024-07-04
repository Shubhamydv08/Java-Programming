package assignment4;

public class Q14 {
    public static void main(String[] args) {
        int arr1[] = {-1,2,3,5,-12};
        int arr2 [] = { 11,12,13,4,15};
        minDif(arr1,arr2);

    }
    static void minDif(int arr1[], int arr2[]) {
        int dif = Math.abs(arr1[0]-arr2[0]);
        int temp ;
        int left=0;
        int right=0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                temp=Math.abs(arr1[i]-arr2[j]);
                if(temp<dif) {
                    dif=temp;
                    left = i;
                    right =j;
                }
            }
        }
        System.out.println(dif);
        System.out.println(left);
        System.out.println(right);
    }
}
