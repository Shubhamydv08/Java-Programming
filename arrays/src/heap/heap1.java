package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class heap1 {
    public static void kth_smallest(int a[], int k){
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < a.length; i++) {
            max.offer(a[i]);
        }
        while(max.size()>k){
            max.poll();
        }
        System.out.println(max);
    }
    public static void kth_largest(int a[],int k){
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for (int i = 0; i <a.length ; i++) {
            min.offer(a[i]);
        }
        while (min.size()>k){
            min.poll();
        }
        System.out.println(min);
    }
    public static void multiplekthsmallest(int a[], int k) {
        PriorityQueue<Integer> maxmul = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < a.length; i++) {
            maxmul.offer(a[i]);
        }
        while (maxmul.size()>k) {
            maxmul.poll();
        }
        int mul =1;
        while (!maxmul.isEmpty()){
            mul= mul*maxmul.poll();
        }
        System.out.println(mul);
    }
    public static void chota_bheem(int l [] , int time ){
        PriorityQueue <Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i <l.length ; i++) {
            max.offer(l[i]);
        }
        int total = 0;
        while(time>0){
            int val = max.poll();
            total = total+val;
            val = (int) Math.ceil(val/2.0);
            max.offer(val);
            time--;
        }
        System.out.println(total);

    }
    public static boolean is_max(int a[], int size){
        int lchild;
        int rchild;
        for (int i = 0; i < a.length/2+1; i++) {
            lchild = 2*i+1;
            rchild = lchild+1;
            if(lchild<size&&a[lchild]>a[i]||rchild<size&&a[rchild]>a[i]){
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args) {
        int a[] ={2,5,4,6,98,7,6,3,2,1};
        int k = 4;
        kth_smallest(a,k);
        kth_largest(a,k);
        multiplekthsmallest(a,k);
        int l [] = {2,5,3,6,9,7,4,5};
        int time = 60;
        chota_bheem(l,time);
    }
}
