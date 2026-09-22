package video26;

import java.util.Scanner;

public class PrimeOrNot2 {

     public static void main(String[] args) {

          // Approach 2: Little optimized

          Scanner scn = new Scanner(System.in);

          System.out.println("Enter a number");
          int num = scn.nextInt();

          for (int i = 2; i <= num; i++) {

               if (IsPrime(i)) {
                    System.out.println(i);
               }
          }

          scn.close();
     }

     static boolean IsPrime(int num) {

          if (num <= 1) {
               return false;
          }

          int i = 2;

          while (i * i <= num) {

               if (num % i == 0) {
                    return false;
               }

               i++;
          }

          return true;
     }
}