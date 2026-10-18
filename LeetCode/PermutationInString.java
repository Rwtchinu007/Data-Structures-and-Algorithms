class Solution {

    public boolean checkInclusion(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        if (m > n) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < m; i++) {
            count[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < m; i++) {
            count[s2.charAt(i) - 'a']--;
        }

        if (allZero(count)) {
            return true;
        }

        for (int right = m; right < n; right++) {

            count[s2.charAt(right - m) - 'a']++;

            count[s2.charAt(right) - 'a']--;

            if (allZero(count)) {
                return true;
            }
        }

        return false;
    }

    private boolean allZero(int[] count) {
        for (int value : count) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}