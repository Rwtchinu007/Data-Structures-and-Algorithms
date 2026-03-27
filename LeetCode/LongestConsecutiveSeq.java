
import java.util.HashSet;
import java.util.Set;





public class LongestConsecutiveSeq {

    public static void main(String[] args) {
        // Brute Force
        // if arr length is 0 return 0; 
        // int arr[] = {1, 0, 1, 2};
        // Arrays.sort(arr);
        // int count = 1;
        // int longest = 0;
        // for (int i = 0; i < arr.length - 1; i++) {
        //     if (arr[i + 1] == arr[i] + 1) {
        //         count++;
        //     } else if (arr[i] == arr[i + 1]) {
        //         continue;
        //     } else {
        //         count = 1;
        //     }
        //     longest = Math.max(longest, count);

        // }
        // longest = Math.max(longest, count);

        // System.out.println(longest);


        // Better approach
        // Map<Integer,Boolean> map = new HashMap<>();
        // int arr[]= {0};
        // int longest = 0;
        // for(int i=0;i<arr.length;i++){
        //     map.put(arr[i],true);
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(map.containsKey(arr[i]-1)){
        //         map.put(arr[i],false);
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(map.get(arr[i])){
        //         int count=1;
        //         while(map.containsKey(arr[i]+count)){
        //             count++;
        //         }
        //         longest = Math.max(longest,count);
        //     }
        // }
        // System.out.println(longest);


        // Optimal Approach
        Set<Integer> set = new HashSet<>();
        int arr[]= {1,0,1,2};
        int longest = 0;
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for (int num:set) {
            if(!set.contains(num-1)){
                int count = 1;
                while(set.contains(num+count)){
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }
        System.out.println(longest);
    }
}
