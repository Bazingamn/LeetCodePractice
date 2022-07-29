import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] nums = {2,1,-3,4};

    }
}

class testSolution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] sorted = new int[m+n];
        int p = 0, q = 0;
        int cur;
        while (p<m || q<n) {
            if (p == m){
                cur = nums2[q++];
            } else if (q == n){
                cur = nums1[p++];
            } else if (nums1[p] < nums2[q]){
                cur = nums1[p++];
            } else {
                cur = nums2[q++];
            }
            sorted[p+q-1] = cur;
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = sorted[i];
        }
    }
}
