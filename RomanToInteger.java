public class RomanToInteger {
    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(new Solution13().RomanToInt(s));
    }
}

/**
 * 罗马字符的书写规则以及计算规则需要注意
 * 
 * 罗马数字主要由六种字符组成 I V X L C D M
 * 小值在大值左边，做减法
 * 小值在大值右边，做加法
 */
class Solution13{

    public int RomanToInt (String s) {
        int sum = 0;
        int prev = getValue(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            if (prev < sum) {
                sum -= getValue(s.charAt(i));
            }else{
                sum += getValue(s.charAt(i));
            }
            prev = sum;
        }
        return sum;
    }

    private int getValue(char ch){
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
