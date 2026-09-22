package video26;

import java.util.Scanner;

public class PrimeOrNot1 {

     public static void main(String[] args) {

          Scanner scn = new Scanner(System.in);

          System.out.println("Enter a number");
          int num = scn.nextInt();

          if (num <= 1) {
               System.out.println("Not Prime");
          } else {

               int i = 2;
               boolean isPrime = true;

               while (i < num) {

                    if (num % i == 0) {
                         isPrime = false;
                         break;
                    }

                    i++;
               }

               if (isPrime) {
                    System.out.println("Prime");
               } else {
                    System.out.println("Not Prime");
               }
          }

          scn.close();
     }
}