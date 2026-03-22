class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = nums.length;
        int first = 0;
        int last = l-1;
        while(first<=last){
            int mid = first + (last-first)/2;
            if(target==nums[mid]){
                return mid;
            } 
            else if(target < nums[mid]) {
                last = mid-1;
            }
            else first = mid+1;
        }


        return first;
        
    }
}

public class SearchInsertPosition{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7,8,9,100,105};
        Solution sol = new Solution();
        System.out.println(sol.searchInsert(arr,10));
    }
}