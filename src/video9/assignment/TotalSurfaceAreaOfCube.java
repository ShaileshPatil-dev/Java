package video9.assignment;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter the side of cube :");
          float side = scn.nextFloat();

          double TSA = 6 * Math.pow(side, 2);
          System.out.println("Total Surface Area Of Cube : " + TSA);
          scn.close();
     }
}
