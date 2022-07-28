package offer58II;

public class LeftRotateString {
}

class Solution {
    public String reverseLeftWords(String s, int n) {
//        return s.substring(n, s.length()+1) + s.substring(0, n+1);

        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = n; i < len; i++) {
            sb.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}