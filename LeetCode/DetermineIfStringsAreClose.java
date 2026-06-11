
import java.util.*;

class Solution {

    public boolean closeStrings(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        if (m != n) {
            return false;
        }

        // frequency array create krenge
        int freq1[] = new int[26];
        int freq2[] = new int[26];

        // storing freq of word 1 and word 2
        for (int i = 0; i < n; i++) {
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);
            int idx1 = ch1 - 'a';
            int idx2 = ch2 - 'a';
            freq1[idx1]++;
            freq2[idx2]++;
        }

        // 1st point char in word 1 should be same to char in word 2
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != 0 && freq2[i] != 0) {
                continue;
            }
            if (freq1[i] == 0 && freq2[i] == 0) {
                continue;
            }
            return false;
        }
        // 2nd point match frequency
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        return Arrays.equals(freq1, freq2);
    }
}
