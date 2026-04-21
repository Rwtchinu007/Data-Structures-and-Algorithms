public class SingleElementInSortedArr{
    public static int  solve(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int mid  = left +(right-left)/2;
            if(mid%2==1){
                mid--;
            }
            if(arr[mid]==arr[mid+1]){
                left = mid+2;
            }
            else right = mid;
        }
        return arr[left];

    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,4,4,5,5,6,7,7,8,8};
        System.out.println(solve(arr));

    }
}