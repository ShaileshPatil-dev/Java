package video9.assignment;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
     public static void main(String[] args) {
          // Area Of Equilateral Triangle : (3/4)^1/2 * a^2

          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the length of side of Equilateral Triangle :");
          float side = scn.nextFloat();

          double area = (Math.sqrt(3) / 4) * side * side;
          System.out.println("area of Equilateral Tringle is " + area);

          scn.close();
     }
}
