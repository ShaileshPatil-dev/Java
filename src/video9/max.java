package video9;

import java.util.Scanner;

public class max {
     public static void main(String[] args) {
          // find the largest number in 3 no
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a number (1)");
          int a = scn.nextInt();
          System.out.println("Enter a number (2)");
          int b = scn.nextInt();
          System.out.println("Enter a number (3)");
          int c = scn.nextInt();

          int max = a ; // on of the three numbers 

          if (b> max) {
               max = b ;
          }
          else if (c > max) {
               max = c ;
          }
          System.out.println("The largest number is "+max);
          
     }
}
