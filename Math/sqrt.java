class Solution {
    public int mySqrt(int x) {
      int ans=0; 
      int first=1;
      int last = x;
      while(first<=last){
        int mid = first + (last-first)/2;
        if(mid<=(x/mid)) {
            ans = mid;
            first = mid+1;
        }
        else{
            last = mid-1;
        }

      }
      return ans;
    }
}
public class sqrt{
    public static void main(String[] args) {
     Solution sol = new Solution();
     System.out.println(sol.mySqrt(20));
    }
}