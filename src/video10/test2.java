package video10;

import java.util.Scanner;

public class test2 {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the day of week (1/2/3/4/5/6/7)");
          int day = scn.nextInt();

          switch (day) {
               case 1 -> System.out.println("Sunday");
               case 2 -> System.out.println("Monday");
               case 3 -> System.out.println("Tuesday");
               case 4 -> System.out.println("Wednesday");
               case 5 -> System.out.println("Thursday");
               case 6 -> System.out.println("Friday");
               case 7 -> System.out.println("Saturday");
               default -> System.out.println("Enter correct number");
          }
          scn.close();
     }
}
