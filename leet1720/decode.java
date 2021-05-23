package leet1720;

public class decode {
    public static void main(String[] args) {

    }
}

/**
 * 未知 整数数组 arr 由 n 个非负整数组成。
 *
 * 经编码后变为长度为 n - 1 的另一个整数数组 encoded ，其中 encoded[i] = arr[i] XOR arr[i + 1] 。
 * 例如，arr = [1,0,2,1] 经编码后得到 encoded = [1,2,3] 。
 *
 * 给你编码后的数组 encoded 和原数组 arr 的第一个元素 first（arr[0]）。
 *
 * 请解码返回原数组 arr 。可以证明答案存在并且是唯一的。
 *
 */
class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length + 1; //原数组长度
        int[] ans = new int[n]; //原数组
        ans[0] = first;
        for (int i = 0; i < n; i++) {
            ans[i] = ans[i-1] ^ encoded[i-1];
        }
        return ans;
    }
}