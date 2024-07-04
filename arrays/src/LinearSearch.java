public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {2,3,5,8,70,90};
        int t= 8;
        int ans = linear(arr,t);
        System.out.println(ans);

    }
    static int linear (int arr[], int t) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==t) {
                return i;
            }
        }
        return -1;
    }
}
