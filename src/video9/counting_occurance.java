package video9;

import java.util.Scanner;

public class counting_occurance {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a number :");
          int number = scn.nextInt();

          System.out.println("Enter a digit to check the occurance :");
          int n = scn.nextInt();

          int counter = 0;
          while (number > 0) {
               int rem = number % 10;
               if (rem == n) {
                    counter ++;
               }  
               number=number/10;
          }
          System.out.println("digit "+n+" occured for "+counter+" times");
          scn.close();
     }
}
