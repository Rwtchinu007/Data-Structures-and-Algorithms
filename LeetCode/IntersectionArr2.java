
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionArr2 {

    private static int[] intersect(int arr1[], int arr2[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int num2 : arr2) {
            if (map.containsKey(num2) && map.get(num2) > 0) {
                list.add(num2);
            }
            map.put(num2, map.get(num2) - 1);
        }
        int ans[] = new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i++] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr1[] = {4, 5, 9};
        int arr2[] = {9, 4, 9, 8, 4};
        intersect(arr1, arr2);
    }
}
