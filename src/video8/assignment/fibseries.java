package video8.assignment;

import java.util.Scanner;

public class fibseries {
     public static void main(String[] args) {
          // To calculate Fibonacci Series up to n numbers.
          System.out.println("Enter the number limit ");
          Scanner scn = new Scanner(System.in);

          int num = scn.nextInt();
          int a = 1, b = 1, c;

          if (num < 0) {
               System.out.println("Enter a valid number");
          } else if (num == 0) {
               System.out.println("0");
          } else {
               System.out.println("Fibonacci series:");

               // First number
               System.out.println(a);

               if (num > 1) {
                    // Second number
                    System.out.println(b);
               }

               // Remaining numbers
               for (int i = 3; i <= num; i++) {
                    c = a + b;
                    System.out.println(c);
                    a = b;
                    b = c;
               }
          }

          scn.close();
     }
}