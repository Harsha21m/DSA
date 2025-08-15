class Solution {
    public int maxProfit(int[] prices) {
        int j = 0;
        int maxprofit = 0;
        for (int i = j + 1; i < prices.length; i++) {
            int profit = 0;
            if (prices[j] > prices[i]) {
                j = i;
            } else {
                profit = prices[i] - prices[j];
            }
            if (profit > maxprofit) {
                maxprofit = profit;
            }
        }
        return maxprofit;
    }
}



class Solution{
     public int maxProfit(int[] prices){
        int maxprofit = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            maxprofit = Math.max(maxprofit, prices[i]-min); 
        }
        return maxprofit;
     }
}
