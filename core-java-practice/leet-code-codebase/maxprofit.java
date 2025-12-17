//LeetCode: 121 Best Time to Buy and Sell Stocks
class Solution {
    public int maxProfit(int[] prices) {
        //solution here
        int mini=prices[0];

        int prof=0;
        for(int i=0; i<prices.length;i++){
            prof=Math.max(prof, prices[i]-mini);//marks the profit on each day and choose the maximum
            mini=Math.min(mini, prices[i]); //looks for the minimum price for the maximum profit
            
        }
        return prof;
    }
}