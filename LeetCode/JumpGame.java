class Solution {
    boolean fun(int i,Boolean dp[],int nums[]){
        if(i==nums.length-1) return true;
        if(dp[i]!=null) return dp[i];
        boolean ans =  false;
        for(int j=1;j<=nums[i];j++){
            ans = fun(i+j,dp,nums);
            if(ans) break;
        }
        return dp[i] = ans;
    }
    public boolean canJump(int[] nums) {
        int n = nums.length;
        Boolean dp[] = new Boolean[nums.length+1];
        return fun(0,dp,nums);
    }
}