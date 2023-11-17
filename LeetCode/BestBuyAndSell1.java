package LeetCode;
class BestBuyAndSell {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int len = prices.length;
        for(int i=0;i<len-1;i++) {
            for(int j = i+1; j < len; j++) {
                int curProfit = prices[j]-prices[i];
                maxProfit = Math.max(maxProfit,curProfit);
            }
        }
        return maxProfit;
    }
}
