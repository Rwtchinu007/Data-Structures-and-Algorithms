public class CyclicSort01{
    public static void cyclicSort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else i++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,9,1,2,4,5,3,6};
        cyclicSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}