
class Solution {

    public void getAllCombinations(int[] arr, int idx, int target,
            List<List<Integer>> ans,
            List<Integer> curr) {

        // base case
        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        // invalid case
        if (idx == arr.length || target < 0) {
            return;
        }

        curr.add(arr[idx]);

        getAllCombinations(arr, idx, target - arr[idx], ans, curr);

        // backtracking
        curr.remove(curr.size() - 1);

        // Exclusion
        getAllCombinations(arr, idx + 1, target, ans, curr);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        getAllCombinations(candidates, 0, target, ans, curr);

        return ans;
    }
}