class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int i = 0;
        while (i < l) {
            int correctIndex = nums[i] ;
            if ( nums[i]< l && nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
        for ( i = 0; i < l; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
    return l;
    }
}