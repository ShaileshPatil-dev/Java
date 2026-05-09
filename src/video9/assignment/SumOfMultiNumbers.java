package video9.assignment;

import java.util.Scanner;

public class SumOfMultiNumbers {
     public static void main(String[] args) {

          Scanner scn = new Scanner(System.in);

          int sum = 0;
          int number;

          System.out.println("Enter Numbers (Enter 0 to exit)");

          while (true) {

               number = scn.nextInt();

               if (number == 0) {
                    break;
               }

               sum += number;
          }

          System.out.println("Sum : " + sum);

          scn.close();
     }
}