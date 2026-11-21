class Solution {
    public String largestGoodInteger(String num) {
        char max = ' ';
        for(int i=1;i<num.length()-1;i++){
            if(num.charAt(i-1)==num.charAt(i) && num.charAt(i)==num.charAt(i+1)){
                max = (char)Math.max(max,num.charAt(i));
            }
        }
        if(max == ' ') return "";
        return ""+max+max+max;
    }
}