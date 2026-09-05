class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int crtIndex = nums[i] - 1;

            if (nums[i] != nums[crtIndex]) {
                int temp = nums[i];
                nums[i] = nums[crtIndex];
                nums[crtIndex] = temp;
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans.add(nums[i]);
            }
        }

        return ans;
    }
}