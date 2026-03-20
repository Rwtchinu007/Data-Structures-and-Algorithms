
public class QuickSort01 {

    public static int findPartition(int arr[], int first, int last) {
        int i = first - 1;
        int j = first;
        int pivot = arr[last];
        while (j < last) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            j++;
        }
        i++;
        int temp = arr[last];
        arr[last] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void quickSort(int arr[],int first,int last){
        if(first>=last) return;
        int pivotIndex = findPartition(arr, first, last);
        quickSort(arr, first, pivotIndex-1);
        quickSort(arr,pivotIndex+1,last);
    }

    public static void main(String[] args) {
          int arr[] = {1, 3, 6, 9, 7, 4, 6, 8, 9, 10, 14, 13};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
