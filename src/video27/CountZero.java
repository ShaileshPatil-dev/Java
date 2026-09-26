package video27;

import java.util.Scanner;

public class CountZero {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.print("Enter a number : ");
          int num = scn.nextInt();

          scn.close();

          System.out.println(count0(num,0));
     }
     static int count0(int n, int c){
          if(n == 0){
               return c;
          }
          int rem = n%10;
          if (rem == 0) {
             return count0(n/10, c+1);
          }
          return count0(n/10, c);
     }
}
