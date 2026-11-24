class Solution {
    public String digitSum(String s, int k) {
        if (s.length() <= k) {
            return s;
        }

        char[] arr = s.toCharArray();
        StringBuilder sc = new StringBuilder();

        for (int i = 0; i < arr.length; i += k) {
            int sum = 0;
            int end = Math.min(i + k, arr.length);

            for (int j = i; j < end; j++) {
                sum += arr[j] - '0';
            }

            sc.append(sum);
        }

        return digitSum(sc.toString(), k);
    }
}