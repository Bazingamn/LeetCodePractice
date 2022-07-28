package DynamicProgramming.offer10I;

public class Fibonaci {
}

/**
 * 方法一：递归
 * 缺点：大量重复计算
 */
class Solution1 {
    public int fib(int n) {
        if (n ==0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}

/**
 * 方法二、动态规划
 * 动态规划一般都脱离了递归，转而由循环迭代完成计算
 */
class Solution2 {
    public int fib(int n) {
        if (n == 0){
            return 0;
        }
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
            dp[i] %= 1000000007;
        }
        return dp[n];
    }
}


/**
 * 方法三、进一步优化，因为斐波那契当前第n个树的状态只和前两个有关，所以可以更节省只存储前两个状态,
 * 降低空间复杂度
 */
class Solution3 {
    int fib(int n){
        if (n == 0 || n == 1) return n;     //base case
        int dp_i_1 = 1, dp_i_2 = 0;     //初始化
        for (int i = 2; i <= n ; i++) {
            int dp_i = dp_i_1 + dp_i_2;
            //滚动更新
            dp_i_2 = dp_i_1;
            dp_i_1 = dp_i;
        }
        return dp_i_1;
    }
}


/**
 * 带备忘录的递归解法，时间复杂度O（n）
 * 仍采用自顶向下
 */
class test {
    int fib(int n) {
        int[] memo = new int[n + 1];
        return helper(memo, n);
    }
    //备忘录,找出重复计算的子问题
    int helper(int[] memo, int n){
        //base case
        if(n==0 || n==1) return n;

        //已经计算过就不再计算,memo记录了每一次计算的值
        if (memo[n] != 0) return memo[n];

        memo[n] = helper(memo, n - 1) + helper(memo, n - 2);
        return memo[n];
    }
}