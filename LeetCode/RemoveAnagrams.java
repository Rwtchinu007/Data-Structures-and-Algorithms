
import java.util.*;

class Solution {

    public List<String> removeAnagrams(String[] words) {

        List<String> ans = new ArrayList<>();

        ans.add(words[0]);

        for (int i = 1; i < words.length; i++) {

            if (!isAnagram(words[i - 1], words[i])) {
                ans.add(words[i]);
            }
        }

        return ans;
    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int h[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            h[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            h[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (h[i] != 0) {
                return false;
            }
        }

        return true;
    }
}