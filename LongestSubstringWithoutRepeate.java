import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeate {
    
}

class Solution3 {
    public int lengthOfLongestSubString(String s) {
        //哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        int rk  = -1;   //右指针rk，初始值为-1
        int ans = 0;    //返回的最长不重复子串
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                //左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                
            }
        }

        
        return 0;
    }
}