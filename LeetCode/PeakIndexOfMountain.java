
class Solution {

    public int peakIndexInMountainArray(int[] arr) {
        int l = arr.length;
        int left = 1;
        int right = l - 2;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                break; 
            }else if (arr[mid] > arr[mid - 1]) {
                left = mid + 1; 
            }else {
                right = mid - 1;
            }

        }
        return mid;
    }
}

public class PeakIndexOfMountain {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1};
        Solution sol = new Solution();
        int ans = sol.peakIndexInMountainArray(arr);
        System.out.println(ans);

    }
}
