import java.util.Arrays;
public class MergeNums {
    // sort
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    // two pointers from the head
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0; // pointer for nums1
        int p2 = 0; // pointer for nums2
        int sorted[] = new int[m+n]; // sorted array
        int cur; // current number
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            }else if (p2 == n) {
                cur = nums1[p1++];
            }else if(nums1[p1] < nums2[p2]){
                cur = nums1[p1++];
            }else{
                cur = nums2[p2++];
            }
            sorted[p1+p2-1] = cur;
        }
        for (int i = 0; i != m+n; i++) {
            nums1[i] = sorted[i];
        }
    }

    // two pointers from the tail
    public static void merge3(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1; // pointer for nums1
        int p2 = n-1; // pointer for nums2
        int tail = m+n-1; // tail pointer
        int cur; // current number
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                cur = nums2[p2--];
            }else if (p2 == -1) {
                cur = nums1[p1--];
            }else if(nums1[p1] > nums2[p2]){
                cur = nums1[p1--];
            }else{
                cur = nums2[p2--];
            }
            nums1[tail--] = cur;
        }
    }

    public static void main(String[] args) {
        int nums1[] = {1,4,7,0,0,0};
        int m = 3;
        int nums2[] = {2,5,6};
        int n = 3;
        merge2(nums1, m, nums2, n);
        for(int i = 0; i < nums1.length; i++){
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
    }
}
