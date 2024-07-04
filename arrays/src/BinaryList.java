public class BinaryList {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,11,13,16};
        int s = 0;
        int e= arr.length-1;
        int t =12 ;
        int ans = Binary(arr,s,e,t);
        System.out.println(ans);

    }
    static int Binary(int arr[],int s, int e, int t) {
        int mid ;
        while(s<=e) {
           mid = s+(e-s)/2;
            if(arr[mid]==t){
                return mid;
            } else if (arr[mid]<t) {
                s=mid+1;
            }else {
                e=mid-1;
            }
        }
        return -1;

    }
}
