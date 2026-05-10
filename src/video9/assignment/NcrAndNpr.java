package video9.assignment;

import java.util.Scanner;

public class NcrAndNpr {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter N :");
          int n = scn.nextInt();
          int copy_n = n;
          System.out.println("Enter R ");
          int r = scn.nextInt();
          int copy_r = r;
          // n!

          int n_fact = 1;

          while (copy_n != 0) {
               n_fact *= copy_n;
               copy_n -= 1;
          }
          int r_fact = 1;

          while (copy_r != 0) {
               r_fact *= copy_r;
               copy_r -= 1;
          }

          // (n-r)!
          int nmr = n - r;
          int nmr_fact = 1;
          while (nmr != 0) {
               nmr_fact *= nmr;
               nmr -= 1;
          }
          System.out.println("Permutation (npr)");
          System.out.println(n_fact / nmr_fact);
          System.out.println("Combination (ncr)");
          System.out.println(n_fact / (r_fact * nmr_fact));

          scn.close();
     }
}
