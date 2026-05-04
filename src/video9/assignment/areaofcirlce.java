package video9.assignment;

import java.util.Scanner;

public class Areaofcirlce {
     public static void main(String[] args) {
          // area of circle
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter the radius of circle :");
          float radius = scn.nextInt();

          double Area_of_circle = Math.PI * Math.pow(radius, 2);
          System.out.println("The area of circle is : " + Area_of_circle);
          scn.close();
     }
}
