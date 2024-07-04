package leetcode;

public class Max_SubArray {
    public static void main(String[] args) {
        int nums[] = {2, -3, 4, 2, -1, 2};
        int ans = max_SubArray(nums);
        System.out.println(ans);
    }
    public static int max_SubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            sum += nums[i];
            if (maxSum<sum){
                maxSum=sum;
            }
            if (sum<0){
                sum=0;
            }

        }
        return maxSum;
    }
}