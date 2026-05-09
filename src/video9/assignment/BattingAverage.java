package video9.assignment;

import java.util.Scanner;

public class BattingAverage {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the runs :");
          int runs = scn.nextInt();

          System.out.println("Enter the out :");
          int out = scn.nextInt();

          float bat_avg;

          if (out == 0) {
               System.out.println("Batting avg : Infinite");
          } else {
               bat_avg = (float) runs / out;

               System.out.println("Batting avg : " + bat_avg);
          }

          scn.close();
     }
}