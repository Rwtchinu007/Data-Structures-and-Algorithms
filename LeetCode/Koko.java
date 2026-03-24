
public class Koko {

    public static  boolean isValid(int arr[], int upper, int hours) {
        long totalHours = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % upper == 0) {
                totalHours += arr[i] / upper;
            } else {
                totalHours += arr[i] / upper + 1;
            }
        }
        if(totalHours>hours) return false;
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {805306368,805306368,805306368};
        int hours = 1000000000;
        int left = 1;
        int right = 0;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            right = Math.max(right, arr[i]);
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isValid(arr, mid, hours)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
