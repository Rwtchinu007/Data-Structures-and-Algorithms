class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
     for(String s:sentences){
      String meow[] = s.split(" ");
      int count = meow.length;
        if(count>max){
            max = count;
        }
     }
    return max;
    }
}
public class LargestSentence{
    public static void main(String[] args) {
        String[] sentences = {
            "alice and bob love leetcode",
            "i think so too",
            "this is great thanks very much"
        };

        Solution obj = new Solution();
        int result = obj.mostWordsFound(sentences);

        System.out.println(result);
    }
}