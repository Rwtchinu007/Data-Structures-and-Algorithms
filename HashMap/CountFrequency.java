
import java.util.HashMap;
import java.util.Map;

public class CountFrequency {

    public static void main(String[] args) {
        int arr[] = {1,2,1,2,1,2,3,3,3};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
         map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
    }
}
