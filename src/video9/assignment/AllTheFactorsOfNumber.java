package video9.assignment;

import java.util.Scanner;

public class AllTheFactorsOfNumber {
     public static void main(String[] args) {
          // Input a number and print all the factors of that number (use loops).
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a number :");
          int number = scn.nextInt();

          for (int i = 1; i <= number; i++) {
               if (number % i == 0) {
                    System.out.print(i + " ");
               }
          }
          scn.close();
     }
}
