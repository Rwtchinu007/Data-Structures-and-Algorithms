public class SubArraykaSum{
    public int SubArraySum(int[] nums, int k) {
            int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        SubArraykaSum s = new SubArraykaSum();
        int ans = s.SubArraySum(arr, 3);
        System.out.println(ans);
    }
}