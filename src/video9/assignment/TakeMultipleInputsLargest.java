package video9.assignment;

import java.util.Scanner;  

public class TakeMultipleInputsLargest {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int num;
          int max = Integer.MIN_VALUE;
          System.out.println("Enter numbers (enter 0 to stop)");
          num = scn.nextInt(); // first input
          while (num != 0) {
               if (num > max) {
                    max = num;
               }
               num = scn.nextInt();// next input
          }
          System.out.println("Largest : " + max);
          scn.close();
     }
}
