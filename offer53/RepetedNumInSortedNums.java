package offer53;

public class RepetedNumInSortedNums {
}

class Solution1 {
    public int search(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                count++;
            }
        }
        return count;
    }
}

/**
 * 二分
 */
class Solution2 {
    public int search(int[] nums, int target) {

        //搜索右边界right
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] <= target) i = m + 1;
            else j = m - 1;
        }
        int right = i;

        // 若数组中无 target ，则提前返回
        if (j >= 0 && nums[j] != target) return 0;

        // 搜索左边界 left
        i = 0; j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if(nums[m] < target) i = m + 1;
            else j = m - 1;
        }
        int left = j;

        return right - left - 1;
    }
}