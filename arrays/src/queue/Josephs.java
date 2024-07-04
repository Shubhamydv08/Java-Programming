package queue;
import java.util.*;
public class Josephs {
    public static int josep(int arr[] ,int k){
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 0; i < arr.length ; i++) {
            Q.offer(arr[i]);
        }
        while (Q.size()>1){
            for(int i=1;i<k;i++){
                Q.add(Q.poll());
            }
            Q.poll();
        }
        return Q.poll();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        int ans = josep(arr,k);
        System.out.println(ans);

    }
}

