package video9.assignment;

import java.util.Scanner;

public class PerimeterOfCircle {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter the Radius of circle");
          float radius = scn.nextFloat();

          double area = 2 * Math.PI * radius;
          System.out.println("Perimeter of circle is : " + area);

          scn.close();
     }
}
