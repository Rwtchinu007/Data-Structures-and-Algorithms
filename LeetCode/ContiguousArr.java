
import java.util.HashMap;
import java.util.Map;

public class ContiguousArr{
    public static void main(String args[]){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int arr[] = {0,1,0,1,1,1,0,0};
        int currSum = 0;
        int longest = 0;
        for(int i=0;i<arr.length;i++){
            currSum += (arr[i]==0)?-1:1;
            if(map.containsKey(currSum)){
                longest = Math.max(longest,i-map.get(currSum));
            }
            else map.put(currSum,i);
        }
        System.err.println(longest);
    }
}