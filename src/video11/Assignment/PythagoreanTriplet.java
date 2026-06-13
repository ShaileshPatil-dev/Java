package video11.Assignment;

import java.util.Scanner;

public class PythagoreanTriplet {
     public static void main(String[] args) {
          // Write a function to check if a given triplet is a Pythagorean triplet or not.
          // (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter a first number :");
          int num1 = scn.nextInt();
          System.out.println("Enter a first number :");
          int num2 = scn.nextInt();
          System.out.println("Enter a first number :");
          int num3 = scn.nextInt();

          Triplate(num1, num2, num3);

          scn.close();
     }

     static void Triplate(int N1, int N2, int N3) {
          if (Math.pow(N1, 2) + Math.pow(N2, 2) == Math.pow(N3, 2)) {
               System.out.println("pythagorean triples");
          } else {
               System.out.println("Not a pythagorean triples");
          }
     }
}
