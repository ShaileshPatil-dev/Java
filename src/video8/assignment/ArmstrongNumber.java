package video8.assignment;

import java.util.Scanner;

public class ArmstrongNumber {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a number");
          int num = scn.nextInt();
          int copy = num ;

          int counter = 0;
          while (copy  != 0) {
               copy = copy /10;
               counter++;
          }
          int sum = 0; 
          copy = num ;
          while (copy !=0) {
               int power = 1;
               int digit = copy %10;
               for (int i = 0; i < counter; i++) {
                    power = power * digit;
                    sum = sum + power;
                    copy = copy/10;

               }
               if (sum == num) {
                    System.out.println("Amstrong number");
               }
               else{
                    System.out.println("Not a Amstrong number");
               }
          }
          scn.close();
     }
}
