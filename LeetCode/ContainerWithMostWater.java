public class ContainerWithMostWater{
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        int maxarea = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int area = Math.min(arr[i],arr[j])*(j-i);
                maxarea = Math.max(area,maxarea);
            }
        }
        System.out.printf("The maximum area between 2 lines is %d units",maxarea);
    }
}