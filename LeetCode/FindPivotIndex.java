class Solution {
    public int pivotIndex(int[] nums) {
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }
        int total = prefix[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            int left = (i == 0) ? 0 : prefix[i - 1];
            int right = total - prefix[i];
            if(left==right){
                return i;
            }
        }
        return -1;
    }
}