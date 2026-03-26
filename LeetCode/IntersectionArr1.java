
import java.util.HashSet;
import java.util.Set;

public class IntersectionArr1{
    public static  int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i]))
                set2.add(nums2[i]);
        }
        int arr[] = new int[set2.size()];
        int i = 0;
        for(int num:set2){
            arr[i++] = num;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr1[] ={};
        int arr2[] ={};
        intersection(arr1, arr2);
    }
}