package video9.assignment;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter length of side:");
          float side = scn.nextFloat();

          float perimeter = 3 * side;
          System.out.println("Perimeter of the Equilateral Triangle is : " + perimeter);

          scn.close();
     }
}
