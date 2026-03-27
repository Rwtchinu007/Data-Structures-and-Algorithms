
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int longest = 0;
        int currSum = 0;
        for(int i=0;i<arr.length;i++){
            currSum += arr[i];
            if(map.containsKey(currSum-k)){
                longest = Math.max(longest,i-map.get(currSum-k));
            }
            if(!map.containsKey(currSum)){
                map.put(currSum,i);
            }
        }
        
        return longest;
    }
}