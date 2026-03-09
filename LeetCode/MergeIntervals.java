
import java.util.*;

class Solution {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparing(a -> a[0]));
        List<int[]> ans = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int curr[] = intervals[i];
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < curr[0]) {
                ans.add(curr);
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(curr[1], ans.get(ans.size() - 1)[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
