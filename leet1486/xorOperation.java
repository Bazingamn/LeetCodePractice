package leet1486;

/**
 * 给你两个整数，n 和 start 。
 *
 * 数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
 *
 * 请返回 nums 中所有元素按位异或（XOR）后得到的结果。
 *
 */
public class xorOperation {
    public static void main(String[] args) {
        System.out.println(new Solution1().xorOp(4, 3));
    }
}


/**
 * 1、模拟；2、数学
 */
class Solution1 {
    public int xorOp(int n, int start) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans ^= (start + 2 * i);
        }
        return ans;
    }
}