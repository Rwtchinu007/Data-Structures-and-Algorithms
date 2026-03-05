// this is brute force approach
// import java.util.*;

// public class Sum3 {

//     public static void main(String[] args) {

//         int[] arr = {-1, 0, 1, 2, -1, -4};
//         Arrays.sort(arr);  // Important

//         List<List<Integer>> result = new ArrayList<>();

//         int n = arr.length;

//         for (int i = 0; i < n - 2; i++) {

//             // Skip duplicate i
//             if (i > 0 && arr[i] == arr[i - 1]) {
//                 continue;
//             }

//             for (int j = i + 1; j < n - 1; j++) {

//                 // Skip duplicate j
//                 if (j > i + 1 && arr[j] == arr[j - 1]) {
//                     continue;
//                 }

//                 for (int k = j + 1; k < n; k++) {

//                     // Skip duplicate k
//                     if (k > j + 1 && arr[k] == arr[k - 1]) {
//                         continue;
//                     }

//                     if (arr[i] + arr[j] + arr[k] == 0) {
//                         result.add(Arrays.asList(arr[i], arr[j], arr[k]));
//                     }
//                 }
//             }
//         }

//         System.out.println(result);
//     }
// }

// This is optimal approach
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i - 1] == nums[i])
                continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> innerlist = Arrays.asList(nums[i], nums[j++], nums[k--]);
                    list.add(innerlist);
                    while (j < k && nums[j - 1] == nums[j])
                        j++;
                    while (j < k && nums[k + 1] == nums[k])
                        k--;
                } else if (sum < 0)
                    j++;
                else
                    k--;
            }
        }
        return list;
    }
}