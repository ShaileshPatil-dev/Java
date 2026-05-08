package video9.assignment;

import java.util.Scanner;

public class Power {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter the number :");
          int num = scn.nextInt();

          System.out.println("Enter the power :");
          int counter = scn.nextInt();

          int result = 1;

          for (int i = 1; i <= counter; i++) {
               result = result * num;
          }
          System.out.println("Ans :" + result);
          scn.close();
     }
}
