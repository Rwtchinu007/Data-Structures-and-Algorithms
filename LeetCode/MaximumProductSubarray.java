class Solution {
    public int maxProduct(int[] nums) {
        int currentMax = nums[0];
        int currentMin = nums[0];
        int maxProduct = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int currentValue = nums[i];
            int previousMin = currentMin;
            int previousMax= currentMax;

            currentMin = Math.min(currentValue, Math.min(
                    previousMax * currentValue,
                    previousMin * currentValue));
            currentMax = Math.max(currentValue, Math.max(
                    previousMax * currentValue,
                    previousMin * currentValue));
            maxProduct = Math.max(maxProduct, currentMax);

        }
        return maxProduct;
    }
}