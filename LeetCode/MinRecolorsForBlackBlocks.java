class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i = 0;
        int j = 0;
        int white = 0;
        int ans = Integer.MAX_VALUE;
        while (j < blocks.length()) {
            if (blocks.charAt(j) == 'W')
                white++;
            if (j - i + 1 == k) {
                ans = Math.min(ans, white);
                if (blocks.charAt(i) == 'W') {
                    white--;
                }
                i++;
            }
            j++;
        }
        return ans;

    }
}