package video11.Assignment;

import java.util.Scanner;

public class SumMethod {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          // Write a program to print the sum of two numbers entered by user by defining your own method.
          System.out.println("Enter a number :");
          int A = scn.nextInt();
          System.out.println("Enter a number :");
          int B = scn.nextInt();
          int sum = Sum(A, B);
          System.out.println("The sum is : " + sum);
          scn.close();
     }
     
     static int Sum(int a, int b) {
          int sum = a + b;
          return sum;
     }

}
