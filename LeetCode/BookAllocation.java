public class BookAllocation {
    public static boolean isValid(int arr[],int upper,int k){
        int sum = 0;
        int count = 1;
        for(int i= 0 ;i<arr.length;i++){
            if(sum+arr[i]>upper){
                count++;
                sum = arr[i];
                if(count>k) return false;
            }
            else sum+= arr[i];
        }
        return true;
    }
    public int allocateBooks(int[] pages, int students) {
        if(students>pages.length) return -1;
        int first = Integer.MIN_VALUE;
        int last = 0;
        int ans = -1;
        for(int i= 0 ;i<pages.length;i++){
            first = Math.max(first,pages[i]);
            last += pages[i];
        }

        while(first<=last){
            int mid = first+(last-first)/2;
            if(isValid(pages,mid,students)){
                ans = mid;
                last = mid-1;
            }
            else first = mid+1;
        }

        return ans;

    }    
}