package video11.Assignment;

import java.util.Scanner;

public class PrimeMethod2 {
     public static void main(String[] args) {
          // Write a function that returns all prime numbers between two given numbers.
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter a number :");
          int num1 = scn.nextInt();
          System.out.println("Enter a number :");
          int num2 = scn.nextInt();

          Prime(num1 , num2);
          scn.close();
     }
     
     static void Prime(int N, int M) {

          for (int num = N; num <= M; num++) {

               if (num < 2) {
                    continue;
               }

               boolean isPrime = true;

               for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                         isPrime = false;
                         break;
                    }
               }

               if (isPrime) {
                    System.out.println(num);
               }
          }
     }
}
