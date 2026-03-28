
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;





public class CountDistinctEleminWindow{
    public static void main(String[] args) {
        // Brute Force
        // int arr[] = {4,1,1};
        // List<Integer> list = new ArrayList<>();
        // Set<Integer> set = new HashSet<>();
        // int window = 2;
        // for(int i=0;i<=(arr.length-window);i++){
        //     for(int j=i;j<=i+window-1;j++){
        //         set.add(arr[j]);
        //     }
        //     list.add(set.size());
        //     set.clear();
        // }
        // int ans[] = new int[list.size()];
        // for(int i=0;i<ans.length;i++){
        //     ans[i] = list.get(i);
        // }
        // for(int i=0;i<ans.length;i++){
        //     System.out.print(ans[i]+" ");
        // }

        // Optimal Approach
        int arr[] = {4,1,1};
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int window = 2;
        for(int i=0;i<window-1;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        int i=0;
        int j=window-1;
        while(j<arr.length){
            map.put(arr[j], map.getOrDefault(arr[j], 0)+1);
            list.add(map.size());
            map.put(arr[i], map.get(arr[i])-1);
            if(map.get(arr[i])==0) map.remove(arr[i]);
            i++;
            j++;
        }
        System.out.println(list);
    }
}