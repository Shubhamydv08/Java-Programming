package leetcode;

import java.util.Arrays;
import java.util.Scanner;
public class CellingNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= {2,4,5,8,13,15,18,20,25};
        System.out.println(Arrays.toString(arr));
        int s=0;
        int e= arr.length;
        System.out.println("enter the no. u want to find the cillingof the target" );
        int t= sc.nextInt();
        int ans=cillingNo(arr,s,e,t);
        System.out.println(ans);

    }
    static int cillingNo(int arr[],int s, int e, int t) {
        int mid ;
        while (s<=e) {
            mid = s+ (e-s)/2;
            if(arr[mid]==t){
                System.out.println("the number is found at index");
                return mid;
            } else if (arr[mid]<t) {
                s=mid+1;
            }else {
                e=mid-1;
            }
        }
        System.out.print("the cillinh of the target " +t +" is ");
        return arr[s];

    }
}
