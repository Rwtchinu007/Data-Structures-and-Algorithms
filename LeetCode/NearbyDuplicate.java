
import java.util.HashSet;
import java.util.Set;

public class NearbyDuplicate{
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            
            if (set.contains(nums[right])) {
                return true;
            }

            set.add(nums[right]);

            if (right - left >= k) {
                set.remove(nums[left]);
                left++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4};
        int k = 2;
        System.out.println(containsNearbyDuplicate(arr, k));
    }
}