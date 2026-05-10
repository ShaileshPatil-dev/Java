package video9.assignment;

import java.util.Scanner;

public class LCM {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the num");
          int num1 = scn.nextInt();
          System.out.println("Enter the num");
          int num2 = scn.nextInt();
          int max;
          if (num1 > num2) {
               max = num1;
          } else {
               max = num2;

          }
          while (true) {

               if (max % num1 == 0 && max % num2 == 0) {
                    System.out.println("LCM = " + max);
                    break;
               }

               max++;
          }
          scn.close();
     }
}
