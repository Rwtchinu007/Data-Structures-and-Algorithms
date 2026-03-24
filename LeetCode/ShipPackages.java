
public class ShipPackages {

    private static boolean isValid(int arr[], int upper, int days) {
        int sum = 0;
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > upper) {
                count++;
                sum = arr[i];
                if (count > days) {
                    return false;
                }
            } else {
                sum += arr[i];
            }

        }
        return true;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3,1,1};
        int days = 4;
        int first = 0;
        int last = 0;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            first = Math.max(first, arr[i]);
            last += arr[i];
        }
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (isValid(arr, mid, days)) {
                ans = mid;
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
