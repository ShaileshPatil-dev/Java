package video25;

import java.util.Scanner;

public class XorRange {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter Lower Limit : ");
          int num1 = scn.nextInt();
          System.out.println("Enter Lower Limit : ");
          int num2 = scn.nextInt();
          int ans = 0;
          for (int i = 0; i <= num2; i++) {
               ans ^= i;
          }
          for (int i = 0; i < num1; i++) {
               ans ^= i;
          }

          System.out.println("Ans : " + ans);
          scn.close();
     }
}
