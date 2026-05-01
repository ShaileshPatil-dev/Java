package video9;

import java.util.Scanner;

public class max2 {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter a number (1)");
          int a = scn.nextInt();
          System.out.println("Enter a number (2)");
          int b = scn.nextInt();
          System.out.println("Enter a number (3)");
          int c = scn.nextInt();

          int max = 0;

          if (a > b) {
               max = a;
          } else if (c > max) {
               max = c;

          }
          System.out.println("The maximum number is :" + max);
          scn.close();
     }
}
