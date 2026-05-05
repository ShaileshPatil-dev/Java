package video9.assignment;

import java.util.Scanner;

public class VolumeOfPrism {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the height of prism:");
          float height = scn.nextFloat();
          System.out.println("Enter the length of prism:");
          float length = scn.nextFloat();
          System.out.println("Enter the width of prism:");
          float width = scn.nextFloat();

          double volume = (1.0 / 2.0) * height * length * width;
          System.out.println("Volume of Prism : " + volume);

          scn.close();
     }
}
