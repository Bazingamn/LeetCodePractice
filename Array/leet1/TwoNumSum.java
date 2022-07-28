package Array.leet1;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums和一个整数目标值 target，
 * 请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 */
public class TwoNumSum {
}

/**
 * 哈希表
 *
 * 时间复杂度 O(N)
 * 空间复杂度 O(N)
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //用hashmap来存储数组，key为值，value为下标，用target-x来进行比较：
        //如果map中存在一个key和target-x相等，则两个整数即为此时map的key和x
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}