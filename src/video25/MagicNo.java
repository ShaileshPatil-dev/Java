package video25;

public class MagicNo {
     public static void main(String[] args) {
          int n = 7;
          int p = 1;
          int sum = 0;
          while (n>0){
               int last = n&1;
               if (last!=0){
                  sum += Math.pow(5, p);  
               }
               p++;
               n=n>>1;
          }
          System.out.println("Magic No :"+sum);
     }
}
