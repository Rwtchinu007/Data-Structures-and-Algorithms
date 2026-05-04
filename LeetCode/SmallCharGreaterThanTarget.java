class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int first = 0;
        int ans =0;
        int last = letters.length - 1;
        while(first<=last){
            int mid = first + (last-first)/2;
            if(letters[mid] > target){
                ans = mid;
                last = mid-1;
            }
            else first = mid+1;
        }
        return letters[ans];
    }
}