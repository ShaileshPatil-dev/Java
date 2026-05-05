package video9.assignment;

import java.util.Scanner;

public class VolumeOfSphere {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter the radius of sphere :");
          float radius = scn.nextFloat();

          double volume = 4 / 3 * Math.PI * Math.pow(radius, 3);

          System.out.println("Volume Of Sphere : " + volume);
          scn.close();

     }
}
