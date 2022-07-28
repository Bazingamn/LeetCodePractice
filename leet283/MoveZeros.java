package leet283;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例：
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        new Solution1().moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
    }
}


/**
 * 双指针两次遍历解法：i、j，第一次将所有非0的赋值给j；第二次剩下为0都给i
 */
class Solution1 {
    public void moveZeroes(int[] nums) {
        if (nums == null){
            return;
        }
        int n = nums.length;
        int j = 0;
        //第一次遍历
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0){
                nums[j++] = nums[i];
            }
        }
        //第二次遍历
        for (int i = j; i < n; i++) {
            nums[i] = 0;
        }
    }
}


/**
 * 双指针一次遍历解法
 */
class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null){
            return;
        }
        int n = nums.length, left = 0, right = 0;
        while (right < n){
            if (nums[right] != 0){
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    //交换双指针
    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}