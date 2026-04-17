public class TowerOfHanoi{
    public static void TOH(int n,char src,char help,char dest){
        String suffix = (n == 1) ? "st" : (n == 2) ? "nd" : (n == 3) ? "rd" : "th";
        if(n==1){
            System.out.printf("move %d%s disc from %c to %c\n",n,suffix,src,dest);
            return ;
        }
        TOH(n-1,src,dest,help);
       System.out.printf("move %d%s disc from %c to %c\n",n,suffix,src,dest);
       TOH(n-1,help,src,dest);
    }
    public static void main(String[] args) {
        TOH(3,'A','B','C');
    }
}