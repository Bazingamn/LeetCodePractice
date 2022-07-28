package offer50;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 */
public class FirstNumShowOnce {
}

/**
 * 哈希表
 */
class Solution1 {
    public char firstUniqChar(String s) {
        //value用bool值更加简化
        Map<Character, Boolean> map = new HashMap<>();
        char[] sc = s.toCharArray();
        for (char c: sc) {
            map.put(c, !map.containsKey(c));
        }
        for (char c: sc) {
            if (map.get(c)) return c;
        }
        return ' ';
    }
}

class Solution2 {
    public char firstUniqChar(String s) {
        Map<Character, Boolean> map = new LinkedHashMap<>();
        char[] sc = s.toCharArray();
        for (char c:sc) {
            map.put(c, !map.containsValue(c));
        }
        for (Map.Entry<Character, Boolean> m:map.entrySet()) {
            if (m.getValue()) return m.getKey();
        }
        return ' ';
    }
}