import java.util.*;
class Solution{
    public static void solve(List<List<Integer>> ans,List<Integer> curr,int i,int nums[]){
        if(i==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        // pick
        curr.add(nums[i]);
        solve(ans, curr, i+1, nums);
        curr.remove(curr.size()-1);

        // to handle dupli
        while(i+1<nums.length &&  nums[i]==nums[i+1]) i++;
        // not pick
        solve(ans, curr, i+1, nums);
    }
    public List<List<Integer>> subsetWithDupl(int nums[]){
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans,new ArrayList<>(),0,nums);
        return ans;
    }
}