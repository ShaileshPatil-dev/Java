package video9.assignment;

import java.util.Scanner;

public class SubtracttheProductandSumofDigitsofanInteger {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a number :");
          int number = scn.nextInt();
          int product_of_digit = 1;
          int sum_of_digit = 0;
          while (number > 0) {
               int rem = number % 10;
               product_of_digit = product_of_digit * rem;
               sum_of_digit = sum_of_digit + rem;
               number = number / 10;
          }
          int result = product_of_digit - sum_of_digit;
          System.out.println(result);
          scn.close();
     }
}
