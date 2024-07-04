package leetcode;
//removeElement
public class Q_27 {
    public static void main(String[] args) {
       int [] nums = {2,2,3,4,5,2};
       int val=2;
       int ans= removeElement(nums,val);
        System.out.println(ans);

    }
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }
}
