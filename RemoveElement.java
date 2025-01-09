public class RemoveElement {

    public static int removeElementHead(int[] nums, int val) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }

    public static int removeElementHeadTail(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right-1];
                right--;
            }else{
                left++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int k = removeElementHeadTail(nums, val);
        System.out.println(k);
    }
}