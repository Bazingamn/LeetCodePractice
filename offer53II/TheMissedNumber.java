package offer53II;

public class TheMissedNumber {

}

/**
 * 二分
 */
class Solution {
    public int missingNumber(int[] nums) {
        // i 为右子数组的首位元素，j 为左子数组的末位元素
        int i = 0, j = nums.length - 1;
        while (i <= j){
            int m = (i + j) / 2;
            if (nums[m] == m) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return i;
    }
}