// This is brute force approach
// public class TrappingRainWater{
    // public static void main(String[] args) {
    //     int total = 0;
    //     int arr[] = {4,2,0,3,2,5};
    //     for(int i=0;i<arr.length;i++){
    //         int leftmax = arr[i];
    //         int rightmax = arr[i];
    //         for(int j=i;j>=0;j--){
    //             leftmax = Math.max(leftmax,arr[j]);
    //         }
    //         for(int j=i;j<arr.length;j++){
    //             rightmax = Math.max(rightmax,arr[j]);
    //         }
    //         total += (Math.min(leftmax,rightmax)-arr[i]);
    //     }
    //     System.out.println(total);
    // }
// }


// This is a better approach
public class TrappingRainWater{
    public static void main(String[] args) {
        int total= 0;
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int leftmax=arr[0];
        int rightmax=arr[arr.length-1];
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            leftmax = Math.max(leftmax, arr[i]);
            left[i] = leftmax;    
        }
        for (int i = arr.length-1; i>=0; i--) {
            rightmax = Math.max(rightmax, arr[i]);
            right[i] = rightmax;    
        }
        for(int i=0;i<arr.length;i++){
            total += (Math.min(left[i],right[i])-arr[i]);
        }
        System.out.println(total);
    }
}