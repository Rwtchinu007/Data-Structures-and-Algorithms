class Solution {
    public void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void solve(int arr[],int idx,List<List<Integer>> ans){
        if(idx==arr.length){
            List<Integer> temp=new ArrayList<>();
            for(int i:arr){
                temp.add(i);
            }
            ans.add(temp);
            return;
        }
        for(int i=idx;i<arr.length;i++){
            swap(arr,idx,i);
            solve(arr,idx+1,ans);
            swap(arr,idx,i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(nums,0,ans);
        return ans;
    }
}