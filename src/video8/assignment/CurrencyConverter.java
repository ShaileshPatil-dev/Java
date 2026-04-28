package video8.assignment;

import java.util.Scanner;

public class CurrencyConverter {
     // Input currency in rupees and output in USD.
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the Currancy amount in rupees :");
          float rupees = scn.nextFloat();

          float USD = rupees / 93.21f;
          System.out.printf("USD conversion : %.3f", USD);

          System.out.printf("USD conversion : %.3f\n", USD);
          scn.close();
     }
}
