package DynamicProgramming.offer63;


public class MaxProfitOfStock {

}

class Solution {
    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE, profit = 0;
        //price每一天的价格
        for (int price: prices) {
            cost = Math.min(cost, price);
            profit = Math.max(profit, price - cost);
        }
        return profit;
    }
}