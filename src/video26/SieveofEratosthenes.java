// Print all non-prime numbers between 0 and n using the Sieve of Eratosthenes.
// package video26;

// import java.util.Arrays;
// import java.util.Scanner;

// public class SieveofEratosthenes {

//     public static void main(String[] args) {

//         Scanner scn = new Scanner(System.in);

//         System.out.println("Enter a number: ");
//         int n = scn.nextInt();

//         scn.close();

//         boolean[] isPrime = new boolean[n + 1];
//         Arrays.fill(isPrime, true);

//         isPrime[0] = false;
//         isPrime[1] = false;

//         for (int i = 2; i <= n; i++) {

//             if (isPrime[i]) {

//                 for (int j = i * 2; j <= n; j += i) {
//                     isPrime[j] = false;
//                 }
//             }
//         }

//         for (int i = 0; i <= n; i++) {

//             if (!isPrime[i]) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }



// Print all prime numbers between 0 and n using the Sieve of Eratosthenes.
package video26;

import java.util.Arrays;
import java.util.Scanner;

public class SieveofEratosthenes {

     public static void main(String[] args) {

          Scanner scn = new Scanner(System.in);

          System.out.println("Enter a number: ");
          int n = scn.nextInt();

          scn.close();

          boolean[] isPrime = new boolean[n + 1];

          // Initially assume all numbers are prime
          Arrays.fill(isPrime, true);

          // 0 and 1 are not prime
          isPrime[0] = false;
          isPrime[1] = false;

          // Find prime numbers
          for (int i = 2; i <= n; i++) {

               if (isPrime[i]) {

                    // i is prime, so print it
                    System.out.print(i + " ");

                    // Mark all multiples of i as not prime
                    for (int j = i * 2; j <= n; j += i) {
                         isPrime[j] = false;
                    }
               }
          }
     }
}