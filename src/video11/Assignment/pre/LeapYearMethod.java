package video11.Assignment.pre;

import java.util.Scanner;

public class LeapYearMethod {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a year :");
          int year = scn.nextInt();
          Lyear(year);
          scn.close();
     }

     static void Lyear(int year) {

          if (year % 4 == 0) {
               System.out.println("Leap year");

          } else {
               System.out.println("Not a Leap year");
          }
     }
}
