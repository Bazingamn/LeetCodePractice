package Array.leet217;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；
 * 如果数组中每个元素互不相同，返回 false 。
 */
public class ExistDuplicatedNums {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(new Solution1().containsDuplicate(nums));
    }
}


/**
 * 哈希表法
 *
 * 时间复杂度：O(N)，N 为数组的长度。
 * 空间复杂度：O(N)，N 为数组的长度。
 */
class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            if (!set.add(num))  return true;
        }
        return false;
    }
}


/**
 * 排序
 *
 * 时间复杂度：O(NlogN)，N 为数组的长度。需要对数组进行排序。
 *
 * 空间复杂度：O(logN)，N 为数组的长度。注意我们在这里应当考虑递归调用栈的深度。
 */
class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }
}


