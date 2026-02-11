
public class prefixContain{
    public static void main(String[] args) {
        String []arr = {"meow","megaman","perman","superman","meme"};
        String prefix = "me";
        int count = 0;
        for(String words :arr) {
            if(words.startsWith(prefix)){
                count++;
            }
        }
        System.out.println(count);
    }
}