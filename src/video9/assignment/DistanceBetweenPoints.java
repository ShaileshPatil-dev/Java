package video9.assignment;

import java.util.Scanner;

public class DistanceBetweenPoints {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the point x1 :");
          int x1 = scn.nextInt();
          System.out.println("Enter the point y1 :");
          int y1 = scn.nextInt();
          System.out.println("Enter the point x2 :");
          int x2 = scn.nextInt();
          System.out.println("Enter the point y2 :");
          int y2 = scn.nextInt();

          double distance = Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));

          System.out.println("Distance :" + distance);
          scn.close();
     }
}
