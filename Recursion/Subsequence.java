
import java.util.ArrayList;
import java.util.List;

public class Subsequence{
    static void Subsequence(int index,int[] nums,List<List<integer>> result,List<Integer> subset){
        if(index>=nums.length){
            result.add(subset);
        }
        subset.add(nums[index]);
        Subsequence(index+1, nums, result, subset);
        subset.remove(nums[index]);
        Subsequence(index+1, nums, result, subset);

        
    }
    public static void main(String[] args) {
        int nums[] = {5,9,7};
        List<List<Integer>> result  = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

    }
}