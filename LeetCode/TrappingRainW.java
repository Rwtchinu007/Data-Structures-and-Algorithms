
import java.util.Scanner;

public class TrappingRainW {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // This is Brute Force Approach
        // for(int i=0;i<arr.length;i++){
        //     int leftmax = arr[i];
        //     int rightmax = arr[i];
        //     for(int j=i;j>=0;j--){
        //         leftmax = Math.max(arr[j], leftmax);
        //     }
        //     for(int j=i;j<arr.length;j++){
        //         rightmax = Math.max(arr[j],rightmax);
        //     }
        //     total += Math.min(leftmax,rightmax) - arr[i];
        // }



        // prefix and suffix Maximum
        // int left[] = new int[n];
        // int right[] = new int[n];
        // int leftmax = arr[0];
        // int rightmax = arr[n-1];
        // for (int i = 0; i < arr.length; i++) {
        //     leftmax = Math.max(arr[i],leftmax); 
        //     left[i] = leftmax;
        // }
        // for (int i = arr.length-1; i >= 0; i--) {
        //     rightmax = Math.max(arr[i],rightmax); 
        //     right[i] = rightmax;
        // }
        // for(int i=0;i<n;i++){
        //     total += Math.min(left[i],right[i])-arr[i];
        // }


        // two pointer
        int left =0;
        int right = n-1;
        int leftmax = 0;
        int rightmax = 0;
        while(left<right){
            leftmax = Math.max(arr[left],leftmax);
            rightmax = Math.max(arr[right],rightmax);
            if(leftmax<rightmax) total += leftmax - arr[left++];
            else total += rightmax- arr[right--];

        }
      System.out.printf("Total Rainwater trapped is %d units",total);
    }
}
