package video9.assignment;

import java.util.Scanner;

public class PalindromeNumber {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the number :");
          int num = scn.nextInt();
          int copy = num;
          int rev = 0;
          while (copy != 0) {
               int rem = copy % 10;
               rev = rev * 10 + rem;
               copy /= 10;
          }
          if (num == rev) {
               System.out.println("Palindrome number");
          } else {
               System.out.println("Not palindrome number");
          }
          scn.close();
     }
}
