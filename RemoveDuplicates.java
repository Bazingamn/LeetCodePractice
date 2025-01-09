public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
       int n = nums.length;
       if (n==0) {
        return 0;
       }
       int slow = 1;
       int fast = 1;
       while (fast < n) {
        if (nums[fast] != nums[fast-1]) {
            nums[slow] = nums[fast];
            slow++;
        }
        fast++;
       }
       return slow;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums);
        System.out.println(k);  
    }
}
