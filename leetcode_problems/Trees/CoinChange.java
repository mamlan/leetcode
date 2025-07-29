//322. Coin Change

class Solution {
    public int coinChange(int[] coins, int amount) {
        /**
        we need to find the fewest number of ways to get to amount
        we'll need an array named dp
        dp will hold the fewest number of ways to get to every int amount till amount
         */
         if(amount==0||coins.length==0) return 0;
         int[] dp = new int[amount+1];

         for(int i=0;i<amount+1; i++){
             dp[i]=Integer.MAX_VALUE;
             for(int j=0;j<coins.length;j++){
                 int coin=coins[j];
                 if(coin==i){
                     dp[i]=1; break;
                 }
                 if(coin <=i&&dp[i-coin]!=Integer.MAX_VALUE){
                     dp[i]= Math.min(dp[i], 1+dp[i-coin]);
                 }
             }
         }
         return dp[amount]>amount ? -1 : dp[amount];
    }
}