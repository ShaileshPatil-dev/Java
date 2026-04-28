package video8.assignment;

import java.util.Scanner;

public class evenodd {
     // Write a program to print whether a number is even or odd, also take input from the user.
     public static void main(String[] args) {
          System.out.println("Enter a number:");
          Scanner scn = new Scanner(System.in);
          int number = scn.nextInt();

          if (number%2 == 0) {
               System.out.println("Number is Even");
          }
          else{
               System.out.println("Number is odd");
          }
          scn.close();
     }
}
