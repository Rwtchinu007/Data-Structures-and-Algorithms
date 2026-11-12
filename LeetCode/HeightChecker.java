class Solution {
    public int heightChecker(int[] heights) {
        int expected[] = Arrays.copyOf(heights,heights.length);
        for(int i=0;i<heights.length-1;i++){
            for(int j=0;j<heights.length-i-1;j++){
                if(expected[j]>expected[j+1]){
                    int temp = expected[j];
                    expected[j] = expected[j+1];
                    expected[j+1] = temp;
                }
            }
        }
            int count = 0;
            for(int i=0;i<heights.length;i++){
                if(expected[i]!= heights[i]) count++;
            }
            return count;
    }
}