import java.util.*;

public class test {

}

class Solutionssss {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i]<=nums2[i]){
                result[i] = nums1[i];
            } else {
                result[i] = nums2[i];
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = result[i];
        }
    }
}