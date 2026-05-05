package video9.assignment;

import java.util.Scanner;

public class VolumeOfCone {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the base radius of cone :");
          float radius = scn.nextFloat();
          System.out.println("Enter the height of cone :");
          float height = scn.nextFloat();

          double volume = (1.0 / 3.0) * (Math.PI) * Math.pow(radius, 2) * height;
          System.out.println("Volume of cone : " + volume);
          scn.close();

     }
}
