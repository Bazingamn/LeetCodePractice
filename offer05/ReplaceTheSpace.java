package offer05;

public class ReplaceTheSpace {
}

class Solution {
    public String replaceSpace(String s) {
        char[] array = new char[s.length() * 3];
        int size = 0;   //替换完后新字符串的长度
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            }else {
                array[size++] = s.charAt(i);
            }
        }
        String newStr = new String(array, 0, size);
        return newStr;
    }
}