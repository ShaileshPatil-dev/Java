package video25;

public class NoofDiigitsWithBaseb {
     public static void main(String[] args) {
          // approch 1 : reduce the digits while number is greater than 0 and increase the counter for each step and sout counter
          int num = 10;
          int base = 2;
          int ans = (int) (Math.log(num)/Math.log(base))+1; // formula
          System.out.println("No of digits = "+ans);
     }
}
