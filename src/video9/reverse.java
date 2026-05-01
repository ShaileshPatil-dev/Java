package video9;

import java.util.Scanner;

public class reverse {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter a number to reverse it :");
          int number = scn.nextInt();

          int reverse  = 0;
          while (number>0) {
               int rem = number%10;
               reverse = reverse * 10 + rem;
               number = number/10;
          }
          System.out.println("The reverse number is "+reverse);
          scn.close();
     }
}
