package Array.leet88;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5};
        System.out.println(nums[-1]);
    }
}


/**
 * 双指针
 */
class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //分别设置两个指针指向头部
        int p1 = 0, p2 = 0;
        //创建额外排序数组
        int[] sorted = new int[m + n];
        //局部临时变量存储比较过程中较小的那个值
        int cur;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            sorted[p1 + p2 -1] = cur;
        }
        //把sorted中的值复制到nums1中
        for (int i = 0; i < m + n; i++) {
            nums1[i] = sorted[i];
        }
    }
}


/**
 * 逆向双指针
 *
 * 方法一中为避免nums1的值被覆盖，所以使用了临时变量；
 * 可以考虑逆向遍历，每次比较取大的值放入nums1最后面，因为nums1后半部分为空，所以不会影响。
 */
class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //创建双指针索引
        int p1 = m, p2 = n;
        int tail = m + n -1;
        int cur;
        while (p1 >= 0 || p2 >= 0) {
            //倒过来的最后一位索引
            if (p1 == -1) {
                cur = nums2[p2--];
            } else if (p2 == -1) {
                cur = nums1[p1--];
            } else if (nums1[p1] > nums2[p2]) {
                cur = nums1[p1--];
            } else {
                cur = nums2[p2--];
            }
            nums1[tail--] = cur;
        }
    }
}


class Train {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 先设置两个指针分别指向两个数组的头部
        int p1 = 0;
        int p2 = 0;
        //额外创建一个排序数组
        int[] sorted = new int[m + n];

    }
}