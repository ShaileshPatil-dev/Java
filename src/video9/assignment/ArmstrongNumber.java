package video9.assignment;

import java.util.Scanner;

public class ArmstrongNumber {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter the number :");
          int number = scn.nextInt();
          int copy = number;
          // no of digits in number 
          int counter = 0;
     while (copy!= 0) {
               copy/=10;
               counter++;
          }
          copy = number;// reset 
          double sum = 0;
          while (copy!=0) {
               int rem = copy % 10 ;
               sum = sum + Math.pow(rem, counter);
               copy/=10;
          }
          if (number == sum) {
               System.out.println("Armstrong number");
          }
          else{
               System.out.println("not an Armstrong number");
          }
          scn.close();
     }
}
