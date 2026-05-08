package video9.assignment;

import java.util.Scanner;

public class DepreciationValue {

     public static void main(String[] args) {

          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the original value :");
          double og_value = scn.nextDouble();

          System.out.println("Enter the depreciation percentage :");
          double percentage = scn.nextDouble();

          if (percentage < 0 || percentage > 100) {

               System.out.println("Invalid Percentage");

          } else {

               System.out.println("Enter number of years :");
               int years = scn.nextInt();

               if (years < 0) {

                    System.out.println("Invalid Years");

               } else {

                    double new_value = og_value;

                    for (int i = 1; i <= years; i++) {

                         new_value = new_value -
                                   (new_value * percentage / 100);
                    }

                    System.out.println("Final Depreciated Value : "
                              + new_value);
               }
          }

          scn.close();
     }
}