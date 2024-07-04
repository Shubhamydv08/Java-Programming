import java.util.Arrays;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        MultiDimenstional Araay
        1 2 3
        4 5 6
        7 8 9
         */
        // In 2D Arrays size of coloumn is not necessary to specify
        int arr [][] = new int [3][3];
        int arr2 [][] = {
                {1, 2, 3},//oth index
                {4, 5},//1st index
                {6,7,8,9,10}//2nd index
        };
        // Input
        for (int row = 0; row <arr.length ; row++) {
            // for each coloumn in every row
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col]= sc.nextInt();
            }
        }
        // Output
//        for (int row = 0; row <arr.length ; row++) {
//            for (int col = 0; col <arr[row].length ; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
//        for (int row = 0; row <arr.length ; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
        // enhanced for loop
        for(int a[] : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
