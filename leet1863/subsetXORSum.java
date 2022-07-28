package leet1863;

/**
 * 一个数组的 异或总和 定义为数组中所有元素按位 XOR 的结果；如果数组为 空 ，则异或总和为 0 。
 *
 * 例如，数组 [2,5,6] 的 异或总和 为 2 XOR 5 XOR 6 = 1 。
 * 给你一个数组 nums ，请你求出 nums 中每个 子集 的 异或总和 ，计算并返回这些值相加之 和 。
 *
 * 注意：在本题中，元素 相同 的不同子集应 多次 计数。
 *
 * 数组 a 是数组 b 的一个 子集 的前提条件是：从 b 删除几个（也可能不删除）元素能够得到 a 。
 *
 */
public class subsetXORSum {
}

/**
 * dfs，考虑第i个位置要或不要所组成的全部子集
 */
class Solution1 {
    public int xorSum(int[] nums) {
        return 0;
    }
    public void dfs(int[] nums, int i, int xor_sum){
        //i表示来到第i个位置
        if (i==nums.length){

        }
    }
}