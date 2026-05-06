package video9.assignment;

import java.util.Scanner;

public class TakeMultipleInputsSum {
     // Take integer inputs till the user enters 0 and print the sum of all numbers
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int num;
          int sum = 0;
          System.out.println("Enter numbers (Enter 0 to stop");
          num = scn.nextInt();
          while (num != 0) {
               sum += num;
               num = scn.nextInt();

          }
          System.out.println("Sum :" + sum);
          scn.close();
     }

}
