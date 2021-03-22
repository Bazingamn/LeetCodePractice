public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 1234554321;
        System.out.println(new Solution9().isPalindrome(x));
    }
}

/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 * 注意-123不是回文数，因此要注意范围，负数不是回文数
 */
class Solution9 {
    public boolean isPalindrome(int x){
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        if (x % 10 == 0 && x != 0) {
            return false;
        }
        int palindrome = 0;
        while (x > palindrome) {
            palindrome = palindrome * 10 + x % 10;
            x /= 10;
        }
        return x == palindrome || x == palindrome / 10;
    }
}