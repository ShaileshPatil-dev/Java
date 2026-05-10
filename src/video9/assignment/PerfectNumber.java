package video9.assignment;

import java.util.Scanner;

public class PerfectNumber {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter Number:");
          int number = scn.nextInt();
          int num = number ;
          int sum = 0;
          for (int i = 1; i < num; i++) {
               if (num%i == 0) {
                    sum += i ;
               }
          }
          if (number == sum ) {
               System.out.println("Perfect number");
          }
          else{
               System.out.println("Not a perfect number");
          }
          scn.close();
     }
}
