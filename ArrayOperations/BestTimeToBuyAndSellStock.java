public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int buyPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(buyPrice<prices[i]) {
                int profit = prices[i]-buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
