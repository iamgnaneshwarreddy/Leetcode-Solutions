class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxP = 0;

        for(int i  = 0;i<prices.length;i++){
            int currP = prices[i]-min;

            maxP = Math.max(currP,maxP);
            if(prices[i]<min){
                min = prices[i];
            }
        }
        return maxP;
    }
}