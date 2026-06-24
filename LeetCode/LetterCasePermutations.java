class Solution {

    public static void solve(List<String> ans,
            StringBuilder sb,
            int i,
            String s) {

        if (i == s.length()) {
            ans.add(sb.toString());
            return;
        }

        char ch = s.charAt(i);

        if (Character.isLetter(ch)) {

            sb.append(Character.toLowerCase(ch));
            solve(ans, sb, i + 1, s);
            sb.deleteCharAt(sb.length() - 1);

            sb.append(Character.toUpperCase(ch));
            solve(ans, sb, i + 1, s);
            sb.deleteCharAt(sb.length() - 1);

        } else {

            sb.append(ch);
            solve(ans, sb, i + 1, s);
            sb.deleteCharAt(sb.length() - 1);

        }
    }

    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        solve(ans, sb, 0, s);
        return ans;

    }
}