class Solution {
    public List<Integer> majorityElementTwo(int[] nums) {
        int count1=0;
        int count2=0;
        int candidate1 = 0;
        int candidate2 = 0;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && nums[i]!=candidate2){
                candidate1 = nums[i];
                count1 = 1;
            }
            else if(count2==0 && nums[i]!=candidate1){
                candidate2 = nums[i];
                count2 = 1;
            }
            else if(candidate1 == nums[i]) count1++;
            else if(candidate2 == nums[i]) count2++;
            else{
                count1--;
                count2--;
            }
        }

        List<Integer> list = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        int threshold = nums.length/3;
        for(int i=0;i<nums.length;i++){
            if(candidate1 == nums[i]) count1++;
            else if(candidate2 == nums[i]) count2++;
        }
        if(count1 > threshold) list.add(candidate1);
        if(count2 > threshold) list.add(candidate2);
        return list;
    }
}