import java.util.Arrays;

public class Heapify {

    public static void heapify(int[] arr, int n, int i) {

        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            heapify(arr, n, smallest);
        }
    }

    public static void heapSort(int[] arr) {

        int n = arr.length;

        // Assumes array is already a Min Heap
        for (int i = n - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 10, 3, 5, 1};

        // Build Min Heap
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }

        System.out.println("Min Heap:");
        System.out.println(Arrays.toString(arr));

        // Heap Sort
        heapSort(arr);

        System.out.println("Descending Order:");
        System.out.println(Arrays.toString(arr));
    }
}