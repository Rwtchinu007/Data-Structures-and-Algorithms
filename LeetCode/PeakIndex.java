public class PeakIndex{
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6,3,8,9};
        int first = 0;
        int last = nums.length-1;
        while(first<=last){
            int mid = first +(last-first)/2;
            if((mid==0 || nums[mid]>nums[mid-1]) && (mid==last || nums[mid]>nums[mid+1])){
                System.out.println(mid);
                break;
            }
            else if(mid!=0 && nums[mid]<nums[mid-1]) last=mid-1;
            else first = mid+1;
        }
    }
}