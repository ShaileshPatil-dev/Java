package video9.assignment;

import java.util.Scanner;

public class WordProblem2 {

     public static void main(String[] args) {
          // Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
          Scanner scn = new Scanner(System.in);

          int sum_of_neg = 0;
          int sum_of_pos_even = 0;
          int sum_of_pos_odd = 0;

          System.out.println("Enter numbers (0 to stop):");

          while (true) {

               int num = scn.nextInt();

               if (num == 0) {
                    break;
               }

               if (num > 0) {

                    if (num % 2 == 0) {
                         sum_of_pos_even += num;
                    } else {
                         sum_of_pos_odd += num;
                    }

               } else {

                    sum_of_neg += num;
               }
          }

          System.out.println("Sum of Positive Even: "
                    + sum_of_pos_even);

          System.out.println("Sum of Positive Odd: "
                    + sum_of_pos_odd);

          System.out.println("Sum of Negative: "
                    + sum_of_neg);

          scn.close();
     }
}