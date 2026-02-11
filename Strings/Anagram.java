
public class Anagram {

    public boolean areAnagrams(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] arr = new int[126];

        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i)]++;
            arr[s2.charAt(i)]--;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "tac";
        Anagram ana = new Anagram();
        System.out.println(ana.areAnagrams(str1, str2));
    }
}
