package video9.assignment;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
     /*
      * CSA=2πrh
      */
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter the radius of Cylinder :");
          float radius = scn.nextFloat();

          System.out.println("Enter the height of Cylinder :");
          float height = scn.nextFloat();

          double CSA = 2 * Math.PI * radius * height;

          System.out.println("Curved Surface Area Of Cylinder : " + CSA);
          scn.close();

     }
}
