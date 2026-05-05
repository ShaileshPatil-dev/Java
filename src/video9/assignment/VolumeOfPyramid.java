package video9.assignment;

import java.util.Scanner;

public class VolumeOfPyramid {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter the base length :");
          float base = scn.nextFloat();
          System.out.println("Enter the height :");
          float heigth = scn.nextFloat();

          double volume = (1.0 / 3.0) * base * heigth;
          System.out.println("Volume Of Pyramid : " + volume);
          scn.close();

     }
}
