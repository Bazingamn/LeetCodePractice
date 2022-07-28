package DynamicProgramming.leet121;

/**
 * 给定一个数组 prices ，它的第i 个元素prices[i] 表示一支给定股票第 i 天的价格。
 *
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。
 * 设计一个算法来计算你所能获取的最大利润。
 *
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 *
 */
public class TheBestTimeToSoldSocket {
}

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int cost = Integer.MIN_VALUE;   //价格最低的一天
        for (int price: prices) {
            //遍历每一天的价格
            cost = Math.min(cost, price);   //找出前i-1天最低的价格
            profit = Math.max(profit, price - cost);    //第i天的价格-前i-1天最低的价格与目前最大利润进行比较
        }
        return profit;
    }
}