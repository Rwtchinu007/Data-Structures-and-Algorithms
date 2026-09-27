class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        Integer [] dp = new Integer[n+1];
        return Math.min(fun(n-1,dp,cost),fun(n-2,dp,cost));
    }
    int fun(int n,Integer dp[],int[] cost){
        if(n<=1) return cost[n];
        if (dp[n]!=null) return dp[n];
        return dp[n] = cost[n] +Math.min(fun(n-1,dp,cost),fun(n-2,dp,cost)); 
    }
}