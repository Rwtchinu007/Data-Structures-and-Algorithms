
public class MergeSort01 {

     public static void Merge(int arr[],int first,int last,int mid){
        int i= first;
        int j = mid+1;
        int k=0;
        int temp[] = new int[last-first+1];
        while(i<=mid && j<=last){
            if(arr[i]<=arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        while(i<=mid) temp[k++] = arr[i++];
        while(j<=last) temp[k++] = arr[j++];

        k=0;
        i=first;
        while(k<temp.length){
            arr[i++] = temp[k++];
        }
    }
    public static void divide(int arr[],int first,int last){
        if(first>=last) return;
        int mid = first +(last-first)/2;
        divide(arr,first,mid);
        divide(arr,mid+1,last);
        Merge(arr,first,last,mid);
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 6, 9, 7, 4, 6, 8, 9, 10, 14, 13};
        divide(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
