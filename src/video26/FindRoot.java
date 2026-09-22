package video26;

import java.util.Scanner;

public class FindRoot {

     public static void main(String[] args) {

          Scanner scn = new Scanner(System.in);

          System.out.println("Enter a number : ");
          int number = scn.nextInt();

          System.out.println("Enter precision : ");
          int precision = scn.nextInt();

          scn.close();

          System.out.println(Sqr(number, precision));
     }

     static double Sqr(int n, int p) {

          int s = 0;
          int e = n;

          // Find the integer part
          while (s <= e) {

               int m = s + (e - s) / 2;

               if (m * m == n) {
                    return m;
               } else if (m * m < n) {
                    s = m + 1;
               } else {
                    e = m - 1;
               }
          }

          // e is now the integer part of square root
          double ans = e;

          double inc = 0.1;

          // Find decimal part
          for (int i = 0; i < p; i++) {

               while (ans * ans <= n) {
                    ans += inc;
               }

               // Went one step too far
               ans -= inc;

               // Move to the next decimal place
               inc = inc / 10;
          }

          return ans;
     }
}