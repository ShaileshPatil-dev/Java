package video9.assignment;

import java.util.Scanner;

public class VolumeOfCylinder {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the radius of cylinder:");
          float radius = scn.nextFloat();
          System.out.println("Enter the height of cylinder:");
          float height = scn.nextFloat();

          double volume = Math.PI * Math.pow(radius, 2) * height;
          System.out.println("Volume Of Cylinder : " + volume);

          scn.close();

     }
}
