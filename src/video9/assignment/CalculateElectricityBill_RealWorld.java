package video9.assignment;

import java.util.Scanner;

public class CalculateElectricityBill_RealWorld {

     public static void main(String[] args) {

          Scanner scn = new Scanner(System.in);

          System.out.println("Enter your name :");
          String name = scn.nextLine();

          System.out.println("Enter your Consumer Number :");
          long consumer_num = scn.nextLong();

          System.out.println("Enter your Previous meter reading :");
          int pre_meter = scn.nextInt();

          System.out.println("Enter your Current meter reading :");
          int cur_meter = scn.nextInt();

          // Units consumed
          int unit = cur_meter - pre_meter;

          double energy_charge = 0;
          double wheeling_charge = 2.28 * unit;
          int fixed_charge = 135;
          double electricity_duty = 0;

          if (unit < 0) {

               System.out.println("Invalid meter reading");

          } else {

               // Energy charge calculation
               if (unit >= 0 && unit <= 100) {

                    energy_charge = 2.65 * unit;

               } else if (unit <= 300) {

                    energy_charge = 5.85 * unit;

               } else if (unit <= 500) {

                    energy_charge = 7.10 * unit;

               } else {

                    energy_charge = 8.35 * unit;
               }

               // Electricity duty
               electricity_duty = (energy_charge * 16) / 100;

               double total_bill = energy_charge
                         + wheeling_charge
                         + fixed_charge
                         + electricity_duty;

               System.out.println("\n------ Electricity Bill ------");

               System.out.println("Customer Name : " + name);
               System.out.println("Consumer Number : " + consumer_num);
               System.out.println("Units Consumed : " + unit);
               System.out.println("Energy Charge : ₹" + energy_charge);
               System.out.println("Wheeling Charge : ₹" + wheeling_charge);
               System.out.println("Fixed Charge : ₹" + fixed_charge);
               System.out.println("Electricity Duty : ₹" + electricity_duty);
               System.out.println("Total Bill : ₹" + total_bill);
          }

          scn.close();
     }
}