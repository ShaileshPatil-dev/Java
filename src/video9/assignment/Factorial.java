package video9.assignment;

import java.util.Scanner;

public class Factorial {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter the number :");

          int number = scn.nextInt();
          int factorial = 1;

          for (int i = number; i >= 1; i--) {
               factorial = factorial * i;
          }

          System.out.println("Factorial is: " + factorial);
          scn.close();
     }
}