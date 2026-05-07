package video9.assignment;

import java.util.Scanner;

public class CommissionPercentage {

     public static void main(String[] args) {

          Scanner scn = new Scanner(System.in);

          System.out.println("Enter your name :");
          String name = scn.nextLine();

          System.out.println("Enter the sales amount :");
          double sales_amount = scn.nextDouble();

          System.out.println("Enter the commission percentage :");
          double commission_percentage = scn.nextDouble();

          // Validation
          if (commission_percentage < 0 || commission_percentage > 100) {

               System.out.println("Invalid commission percentage");

          } else {

               // Calculate commission
               double commission = (sales_amount * commission_percentage) / 100;

               System.out.println("\n------ Commission Details ------");
               System.out.println("Employee Name : " + name);
               System.out.println("Sales Amount : " + sales_amount);
               System.out.println("Commission Percentage : "
                         + commission_percentage + "%");
               System.out.println("Commission Earned : " + commission);
          }

          scn.close();
     }
}