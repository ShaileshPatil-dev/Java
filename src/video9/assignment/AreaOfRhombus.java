package video9.assignment;

import java.util.Scanner;

public class AreaOfRhombus {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the length of diagonal (1) of the Rhombus :");
          float diagonal_1 = scn.nextFloat();
          System.out.println("Enter the length of diagonal (2) of the Rhombus :");
          float diagonal_2 = scn.nextFloat();

          double Area = 0.5 * diagonal_1 * diagonal_2;
          System.out.println("area of Rhombus is :" + Area);

          scn.close();

     }
}
