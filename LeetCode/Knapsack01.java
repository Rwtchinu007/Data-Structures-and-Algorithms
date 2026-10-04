class Solution {
// 	int solve(int wt[], int val[], int n, int cap,Integer dp[][]) {
// 		if (n == 0 || cap == 0)
// 			return 0;
// 		if (dp[n][cap] != null) return dp[n][cap];
// 		if (wt[n - 1] <= cap) {
// 			return dp[n][cap] = Math.max(solve(wt, val, n - 1, cap - wt[n - 1],dp) + val[n - 1], solve(wt, val, n - 1, cap,dp));
// 		}
// 		return dp[n][cap] = solve(wt,val,n-1,cap,dp);
// 	}
	public int knapsack(int W, int val[], int wt[]) {
	    Integer dp[][] = new Integer[wt.length+1][W+1];
	    for(int i=0;i<=wt.length;i++){
	        for(int j =0;j<=W;j++){
	              if(i==0||j==0) dp[i][j] = 0;
	            else if(wt[i-1]<=j) {
	               dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
	            }
	            else dp[i][j] = dp[i-1][j];
	        }
	    }
	    return dp[wt.length][W];
// 		return solve(wt,val,wt.length,W,dp);
		
	}
}
