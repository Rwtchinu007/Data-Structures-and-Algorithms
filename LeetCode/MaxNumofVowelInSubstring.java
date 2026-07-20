class Solution {
     public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int maxVowels(String s, int k) {
        int i=0;
        int j=0;
        int maxVowel = 0;
        int sum = 0;
        while(j<s.length()){
            if(isVowel(s.charAt(j))) sum++;
            if(j-i+1==k){
                maxVowel = Math.max(maxVowel,sum);
                if(isVowel(s.charAt(i))) sum--;
                i++;
            }
            j++;


        }
        return maxVowel;

        
    }
}