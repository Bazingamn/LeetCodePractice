import java.util.HashSet;
import java.util.Set;

/**
 * leetcode 3
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 
 */
public class LongestSubstringWithoutRepeate {
    public static void main(String[] args) {
        String s = "pwwkewabcdd";
        System.out.println(new Solution3().lengthOfLongestSubString(s));
    }
}

/**
 * 滑动窗口 解法
 */
class Solution3 {
    public int lengthOfLongestSubString(String s) {
        //返回的最长不重复子串的长度
        int ans = 0;
        //不重复子串的右指针
        int rk = -1;
        //原字符串的长度
        int n = s.length();

        //用hashset保存不重复的子串
        Set<Character> occ = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (i !=0 ) {
                //左指针右移，移除一个字符
                occ.remove(s.charAt(i-1));
            }
            while(rk+1 < n && !occ.contains(s.charAt(rk+1))){
                //右移右指针
                occ.add(s.charAt(rk + 1));
                rk++;
            }
            ans = Math.max(ans, rk -i + 1);
        }
        return ans;
    }
}
