package video9.assignment;

import java.util.Scanner;

public class PerimeterOfRectangle {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter length of rectangle :");
          float length = scn.nextFloat();
          System.out.println("Enter width of rectangle :");
          float width = scn.nextFloat();

          float perimeter = 2 * (length + width);
          System.out.println("Perimeter Of Rectangle is : " + perimeter);
          scn.close();
     }
}
