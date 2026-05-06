package video9.assignment;

import java.util.Scanner;

public class FibonacciSeries {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the number:");
          int number = scn.nextInt();

          int a = 0;
          int b = 1;

          System.out.println("Fibonacci Series:");
          for (int i = 0; i < number; i++) {
               System.out.print(a + " ");
               int c = a + b;
               a = b;
               b = c;
          }

          scn.close();
     }
}