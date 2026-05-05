package video9.assignment;

import java.util.Scanner;

public class PerimeterOfRhombus {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          /*
           * perimeter of rhombus = 4a
           * Perimeter of rhombus = 2 (p+q)^0.5
           */
          System.out.println("Enter the diagonal of the Rhombus :");
          float diagonal1 = scn.nextFloat();
          System.out.println("Enter the diagonal of the Rhombus :");
          float diagonal2 = scn.nextFloat();

          double perimeter = 2 * Math.sqrt((Math.pow(diagonal1, 2) + Math.pow(diagonal2, 2)));
          System.out.println("Perimeter of rhombus is : " + perimeter);

          scn.close();

     }
}
