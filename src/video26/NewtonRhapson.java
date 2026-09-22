package video26;

import java.util.Scanner;

public class NewtonRhapson {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter a number : ");
          int num = scn.nextInt();

          scn.close();

          System.out.println(FindSqr(num));
     }

     static double FindSqr(int n) {
          double x = n; // first guess
          double root = 0.0;

          while (true) {
               root = 0.5 * (x + (n / x));

               double difference = Math.abs(root - x);

               if (difference < 0.001) {
                    break;
               }

               x = root;
          }

          return root;
     }
}