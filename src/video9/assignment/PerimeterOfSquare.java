package video9.assignment;

import java.util.Scanner;

public class PerimeterOfSquare {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter side of Square:");
          float side = scn.nextFloat();

          float perimeter = 4 * side;
          System.out.println("Perimeter Of Square is : " + perimeter);

          scn.close();

     }
}
