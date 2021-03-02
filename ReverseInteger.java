import java.lang.ProcessBuilder.Redirect;

public class ReverseInteger {
    public static void main(String[] args) {
        int number = 2147483647;
        System.out.println(new Solution7().reverse(number)); 
    }
}

/**
 * 整数反转
 * 给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * 
 * 本题需注意范围
 * -2^31~2^31    
 * 2147483648
 */
class Solution7{
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int pop = x % 10;
            result = result * 10 + x % 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)){
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)){
                return 0;
            }
            x /= 10;
        }
        return result;
    }
}
