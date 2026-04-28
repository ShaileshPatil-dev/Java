package video8.assignment;

import java.util.Scanner;

public class largest {
     public static void main(String[] args) {
          // Take 2 numbers as input and print the largest number
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter the first number :");
          int num1 = scn.nextInt();
          System.out.println("Enter second number : ");
          int num2 = scn.nextInt();

          if (num1 > num2) {
               System.out.println("First number is largest");
          } else {
               System.out.println("Second number is largest");
          }
          scn.close();
     }
}
