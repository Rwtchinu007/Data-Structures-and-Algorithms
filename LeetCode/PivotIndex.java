class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int c_sum = 0;
        for(int i=0;i<nums.length;i++){
            int ls = c_sum;
            int rs = sum-ls-nums[i];
            if(ls==rs) return i;
            c_sum+=nums[i];
        }
        return -1;
        
    }
}