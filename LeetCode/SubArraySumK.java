
import java.util.HashMap;
import java.util.Map;

public class SubArraySumK{
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int currSum = 0;
        map.put(0, 1);
        for (int num : nums) {
            currSum += num;
            if (map.containsKey(currSum - k))
                count += map.get(currSum - k);
            map.put(currSum,map.getOrDefault(currSum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1};
        int k = 2;
        System.out.println(subarraySum(arr, k));
    }
}