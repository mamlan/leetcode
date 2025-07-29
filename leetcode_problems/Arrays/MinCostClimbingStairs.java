// 746. Min Cost Climbing Stairs (easy)

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(helper(cost, dp, 0), helper(cost, dp, 1));
    }
    public int helper(int[] cost, int[] dp, int index){
        if(cost.length<=index) return 0;
        if(dp[index]!=-1) return dp[index];

        int next= helper(cost, dp, index+1);
        int next2= helper(cost, dp, index+2);
        return dp[index]= cost[index] + Math.min(next, next2);
    }
}
// goal is to reach the end of cost array
// two possibilities: either go one step forward or two steps forward
//     -> cur_sum + cost[i]
//     -> cu

// memoization
