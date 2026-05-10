package video10;

import java.util.Scanner;

public class test3 {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the day of week (1/2/3/4/5/6/7)");
          int day = scn.nextInt();

          switch (day) {
               case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
               case 6, 7 -> System.out.println("Weekend");
               default -> System.out.println("Enter correct number");
          }
          scn.close();
     }
}
