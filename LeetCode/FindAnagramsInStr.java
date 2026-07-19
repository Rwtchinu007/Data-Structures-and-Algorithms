class Solution {
    	private boolean match(int arr1[], int arr2[]) {
		for (int i = 0; i<26; i++) {
			if (arr1[i] != arr2[i])
				return false;
		}
		return true;
	}
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int m = s.length();
        int n = p.length();
        if(n>m) return ans;
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(char c:p.toCharArray()){
            arr1[c-'a']++;
        }
        int i=0;
        int j=0;
        while(j<s.length()){
            arr2[s.charAt(j)-'a']++;
            if(j-i+1==p.length()){
                if(match(arr1,arr2)) ans.add(i);
                arr2[s.charAt(i)-'a']--;
                i++;

            }
            j++;
        }
return ans;
    }
}