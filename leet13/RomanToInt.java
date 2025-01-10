package leet13;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

	public static int romanToInt(String s) {
        Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            if (i < s.length()-1 && symbolValues.get(s.charAt(i)) < symbolValues.get(s.charAt(i+1))) {
                sum -= symbolValues.get(s.charAt(i));
            }else{
                sum += symbolValues.get(s.charAt(i));
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(romanToInt(s));
    }
}
