
import java.util.ArrayList;
import java.util.List;

public class Subsets{

    public static void solve(List<List<Integer>> ans,List<Integer> curr,int i,int[] nums){
        if(nums.length == i){
            ans.add(new ArrayList<>(curr));
            return;
        }
        // picking the element
        curr.add(nums[i]);
        solve(ans, curr, i+1, nums);
        curr.remove(curr.size()-1);

        // not picking the element
        solve(ans, curr, i+1, nums);


    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans,new ArrayList<>(),0,nums);
        System.out.println(ans);
    }
}