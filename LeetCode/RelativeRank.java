
import java.util.Arrays;

class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;

        // Step 1: Store original indices
        Integer[] indices = new Integer[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Step 2: Sort indices according to scores (descending)
        Arrays.sort(indices, (a, b) ->
            Integer.compare(score[b], score[a])
        );

        // Step 3: Create result array
        String[] result = new String[n];

        // Step 4: Assign ranks
        for (int i = 0; i < n; i++) {

            int originalIndex = indices[i];

            if (i == 0) {
                result[originalIndex] = "Gold Medal";
            }
            else if (i == 1) {
                result[originalIndex] = "Silver Medal";
            }
            else if (i == 2) {
                result[originalIndex] = "Bronze Medal";
            }
            else {
                result[originalIndex] = String.valueOf(i + 1);
            }
        }

        return result;
    }
}