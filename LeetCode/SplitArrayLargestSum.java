public class SplitArrayLargestSum{
    public static boolean isValid(int arr[],int upper,int k){
        int sum = 0;
        int count = 1;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>upper){
                count++;
                sum = arr[i];
                if(count>k) return false;
            }
            else {
                sum += arr[i];
            }
        }
        return true;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int k =2;
        int ans = 0;
        int left  = arr[0];
        int right = 0;
        for(int i=0;i<arr.length;i++){
            left = Math.max(left,arr[i]);
            right += arr[i];
        }
        while(left<=right){
            int mid = left+(right-left)/2;
            if(isValid(arr,mid,k)){
                ans = mid;
                right = mid-1;
            }
            else {
                left = mid +1;
            }
        }
        System.out.println(ans);
    }
}