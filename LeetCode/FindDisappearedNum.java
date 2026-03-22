import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> missing = new ArrayList<>();
        int l = nums.length;
        int i = 0;
        while(i<l){
            int correctIndex = nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else i++;
        }
        for ( i = 0; i < l; i++) {
            if(nums[i]!=i+1){
                missing.add(i+1);
            }
        }
        return missing;
    }
}

public class FindDisappearedNum{
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,6,7,8,2,2,3};
        Solution sol = new Solution();
        System.out.println(sol.findDisappearedNumbers(arr)); 
    }
}