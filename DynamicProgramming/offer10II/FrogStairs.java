package DynamicProgramming.offer10II;

/**
 * 青蛙跳台阶问题，是变相的斐波那契数列
 */
public class FrogStairs {
}

class Solution {
    public int numWays(int n) {
        int a = 1, b = 1, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
