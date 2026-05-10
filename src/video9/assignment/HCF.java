package video9.assignment;

import java.util.Scanner;

public class HCF {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a num");
          int num1 = scn.nextInt();
          System.out.println("Enter a num");
          int num2 = scn.nextInt();

          int hcf = Integer.MIN_VALUE;

          int min;
          if (num1 > num2) {
               min = num2;
          } else {
               min = num1;
          }
          for (int i = 1; i <= min; i++) {
               // Check common factor
               if (num1 % i == 0 && num2 % i == 0) {
                    hcf = i;
               }
               System.out.println("HCF = " + hcf);

          }

          scn.close();
     }
}
