package video9.assignment;

import java.util.Scanner;

public class AreaofTriangle {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the height of triangle");
          float height = scn.nextFloat();
          System.out.println("Enter the base of triangle");
          float base= scn.nextFloat();

          double area = 0.5 * base * height;
          System.out.println("The area of triangle is :"+area);
          scn.close();

     }
}
