class Solution {
    int N;
    Integer[] buyCache;
    Integer[] sellCache;
	
    public int maxProfit(int[] prices) {
        N = prices.length;
        buyCache = new Integer[N];
        sellCache = new Integer[N];
        return buy(prices, 0);
    }
    
    private int buy(int[] prices, int i) {
        if(i >= N) 
            return 0;
        if(buyCache[i] != null) 
            return buyCache[i];
        return buyCache[i] = Math.max(sell(prices, i + 1) + -prices[i], buy(prices, i + 1));
    }
    
    private int sell(int[] prices, int i) {
        if(i >= N) 
            return 0;
        if(sellCache[i] != null) 
            return sellCache[i];
        return sellCache[i] = Math.max(buy(prices, i + 2) + prices[i], sell(prices, i + 1));
    }
}
