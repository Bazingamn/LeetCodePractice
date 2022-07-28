package Array.leet53;

/**
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 子数组 是数组中的一个连续部分。
 */
public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new Solution1().maxSubArray(nums));
    }
}


/**
 * 动态规划
 *
 * 求出在每个位置时的最大连续子数组和，然后返回这其中的最大一个即可
 *
 * 时间复杂度：O(n)，n 为 nums 数组的长度。我们只需要遍历一遍数组即可求得答案。
 * 空间复杂度：O(1)。我们只需要常数空间存放若干变量。
 */
class Solution1 {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int sum = nums[0];
        for (int num: nums) {
            pre = Math.max(pre + num, num);
            sum = Math.max(sum, pre);
        }
        return sum;
    }
}


class Solution2 {
    public int maxSubArray(int[] nums) {
        // 求第i个位置时的最大连续子数组和f(i), 返回这其中最大的一个。
        // f(i)可以通过第i个位置的数与第i个位置的数+f(i-1)，两者之间进行比较。
        int sum = nums[0];
        int pre = 0;
        for (int num:nums) {
            pre = Math.max(num, num + pre);
            sum = Math.max(pre, sum);
        }
        return sum;
    }
}
