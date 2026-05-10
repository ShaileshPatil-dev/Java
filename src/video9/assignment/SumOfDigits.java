package video9.assignment;

import java.util.Scanner;

public class SumOfDigits {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the number");
          int num = scn.nextInt();
          int sum = 0;
          while (num != 0) {
               int rem = num % 10;
               sum += rem;
               num /= 10;
          }
          System.out.println("Sum :" + sum);
          scn.close();
     }
}
