public class StockMaxProfit121 {
    public static int maxProfit1(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
    public static int maxProfit2(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }else if ((prices[i]-minPrice) > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int []prices = {7,1,5,3,6,4};
        int max = maxProfit2(prices);
        System.out.println(max);
    }
}
