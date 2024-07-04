package leetcode;

import java.util.Arrays;

public class FrstAndLastPosition {
    public static void main(String[] args) {
        int nums[]= {1,2,2,2,4,5,6,6,6};
        int target =2;
        int[] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] searchRange(int []nums,int target) {
        int[] ans ={-1,-1} ;
        int start = search(nums,target,true);
        int end = search(nums ,target,false);
        ans[0] = start;
        ans[1]= end;
        return ans;
    }
    static int search(int nums[],int target,boolean FirstIndex) {
        int ans=-1;
        int start =0;
        int end=nums.length-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if(target<nums[mid]) {
                end=mid-1;
            } else if (target>nums[mid]) {
                start=mid+1;
            } else{
                ans=mid;
                if (FirstIndex) {
                    end=mid-1;
                }else
                    start=mid+1;
            }
        }
        return ans;
    }
}
