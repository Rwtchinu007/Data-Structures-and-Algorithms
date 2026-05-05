class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        int[] cnt = new int[len+1];
        for(int i=0;i<len;i++){
            cnt[nums[i]]++;
            if(cnt[nums[i]]>1){
                return nums[i];
            }
        }
        return len;
    }
}
public class FindDupli{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = {1,2,3,4,5};
        System.out.println(sol.findDuplicate(arr));

    }
}