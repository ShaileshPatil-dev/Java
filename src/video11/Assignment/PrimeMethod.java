package video11.Assignment;

import java.util.Scanner;

public class PrimeMethod {
 public static void main(String[] args) {
      // Define a method to find out if a number is prime or not.
     Scanner scn = new Scanner(System.in);
     System.out.println("Enter a number :");
     int number = scn.nextInt();

      if (Isprime(number)) {
               System.out.println("Prime number");
          }
          else
          {
               System.out.println("Not a Prime number");
          }
          scn.close();
 }

     static boolean Isprime(int n) {
          if (n <= 1) {
               return false;
          }

          for (int i = 2; i <= Math.sqrt(n); i++) {
               if (n % i == 0) {
                    return false;
               }
          }

          return true;
     }
}
