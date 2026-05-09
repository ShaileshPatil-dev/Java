package video9.assignment;

import java.util.Scanner;

public class CompoundInterest {
     public static void main(String[] args) {

          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the principal amount :");
          double p_amount = scn.nextDouble();

          System.out.println("Enter the annual interest rate :");
          double i_rate = scn.nextDouble();

          System.out.println("Enter the time in years :");
          int time = scn.nextInt();

          double compound_amount = p_amount * Math.pow((1 + i_rate / 100), time);

          double compound_interest = compound_amount - p_amount;

          System.out.printf("Compound Interest : %.2f",
                    compound_interest);

          scn.close();
     }
}