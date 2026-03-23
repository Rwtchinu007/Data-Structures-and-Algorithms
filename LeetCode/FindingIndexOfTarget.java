// Leetcode Problem no. 34
class Solution {
    public static int findingIndex(int[] nums,int target,int left,int right,boolean forStartingIndex){
        int ans = -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                ans = mid;
                if(forStartingIndex){
                    right = mid-1;
                }
                else left = mid+1;
            }
            else if (nums[mid]<target) left = mid+1;
            else right = mid-1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int left = 0; 
        int l = nums.length;
        int right = l-1 ;
        int ans[] = new int[2];
       ans[0] = findingIndex(nums,target,left,right,true);
       ans[1] = findingIndex(nums,target,left,right,false);
       return ans;
    }
}