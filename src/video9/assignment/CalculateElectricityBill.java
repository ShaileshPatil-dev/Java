package video9.assignment;

import java.util.Scanner;

public class CalculateElectricityBill {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter the amount of unit consumed :");
          int unit = scn.nextInt();

          if (unit < 100) {
               System.out.println("Electricity Bill :" + (5 * unit));
          } else if (unit < 200 && unit > 100) {
               System.out.println("Electricity Bill :" + (7 * unit));
          } else {
               System.out.println("Electricity Bill :" + (10 * unit));
          }
          scn.close();
     }
}
