class Solution {
    public int rearrangeCharacters(String s, String target) {
        int freq[] = new int[26];
        int targetFreq[] = new int[26];

        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < target.length(); i++) {
            targetFreq[target.charAt(i) - 'a']++;
        }

        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < 26; i++) {
            if(targetFreq[i] > 0) {
                ans = Math.min(ans, freq[i] / targetFreq[i]);
            }
        }

        return ans;
    }
}