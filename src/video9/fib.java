package video9;

import java.util.Scanner;

public class fib {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter a number :");
          int n = scn.nextInt();

          int a = 0; // base condition
          int b = 1; // base condition
          int count = 0;
          System.out.print("Fib series :");
          while (count <= n) {
               int c = a + b;
               System.out.print(a + " ");
               a = b;
               b = c;
               count += 1;
          }
          scn.close();

     }
}
