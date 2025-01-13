package String;

public class leet28_strStr {
    public static int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        for (int i = 0; i + m <= n; i++) {
            boolean flag = true;
            for (int j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;  
    }

    // KMP算法
    public static int strStr2(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        if (m == 0) {
            return 0;
        }
        int[] pi = new int[m];
        for (int i = 1, j = 0; i < m; i++) {
            while (j > 0 && needle.charAt(i)!= needle.charAt(j)) {
                j = pi[j - 1];  // 回退 j 位置    前缀表 前缀表中对应的位置  前缀表中对应的位置
            }
        }
        
        return 0;
    }

    public static void main(String[] args) {
        
    }
}
