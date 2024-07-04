package sorting;
import java.util.Arrays;

public class BubbleSrt {
    public static void main(String[] args) {
        int arr[] = {-10,-15,5,10,1,2,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        selection(arr);
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int arr []){
        boolean swapped;
        for (int i =0 ; i< arr.length;i++) {
            swapped=false;
            for (int j=1; j< arr.length-i;j++) {
                if (arr[j] <arr[j-1]) {
                    swap(arr,j,j-1);
                    swapped=true;
                }
            }
            if(swapped=false){
                break;
            }
        }
    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length-1 ; i++) {
            int min=i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }
                swap(arr,i,min);
            }
        }
    }
    static void insertion(int arr []) {
        for (int i = 1; i < arr.length ; i++) {
            int key= arr[i];
            int j = i-1;
            while (j>=0 && arr[j]> key) {
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    static void swap(int arr[] , int i, int j){
        int temp= arr[j];
        arr[j]= arr[i];
        arr[i] = temp;
    }
}
