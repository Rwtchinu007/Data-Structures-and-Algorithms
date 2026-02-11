public class SortWords {
    public String sort(String s) {
      String arr[] = s.split(" ");
      for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
            // inner loops will compare words side to side
            if(arr[j].compareTo(arr[j+1])>0){
                String temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
      }
      String ans = String.join(" ",arr);
      return ans;     
    }
    public static void main(String[] args) {
        String s = "taj mahal is situated in agra";
        SortWords sw = new SortWords();
        System.out.println(sw.sort(s));
    }
}
