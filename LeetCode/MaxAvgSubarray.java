class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int sum = 0;

        // first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // slide the window
        for (int right = k; right < nums.length; right++) {
            sum += nums[right];      // add new element
            sum -= nums[left];       // remove old element
            left++;                  // move window

            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}