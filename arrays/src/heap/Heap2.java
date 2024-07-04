package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap2 {
    public static void kthMinimum(int arr[],int k){
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length ; i++) {
            max.offer(arr[i]);
        }
        while(max.size()>k){
            max.poll();
        }
        System.out.println(max);
    }
    public static boolean isMaxheap(int arr[]){
        int lchild;
        int rchild;
        int size = arr.length;
        for (int i = 0; i <size/2+1 ; i++) {
            lchild=i*2+1;
            rchild=lchild+1;
            if (lchild<size&&arr[lchild]>arr[i]||rchild<size&&arr[rchild]>arr[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean isMinheap(int arr[]){
        int lchild;
        int rchild;
        int size=arr.length;
        for (int i = 0; i <size/2+1 ; i++) {
            lchild= 2*i+1;
            rchild=lchild+1;
            if (lchild<size&&arr[lchild]<arr[i]|| rchild<size&&arr[rchild]<arr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr []= {1,2,3,4,5,6};
        int k=4;
        kthMinimum(arr,k);
        System.out.println( isMaxheap(arr));
    }
}
