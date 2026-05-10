package video9.assignment;

import java.util.Scanner;

public class FutureInvestmentValue {
     public static void main(String[] args) {

          Scanner scn = new Scanner(System.in);

          System.out.println("Enter investment amount:");
          double principal = scn.nextDouble();

          System.out.println("Enter annual interest rate:");
          double rate = scn.nextDouble();

          System.out.println("Enter number of years:");
          int years = scn.nextInt();

          double futureValue = principal;

          for (int i = 1; i <= years; i++) {
               futureValue = futureValue +
                         (futureValue * rate / 100);
          }

          System.out.println("Future Investment Value: " + futureValue);

          scn.close();
     }
}