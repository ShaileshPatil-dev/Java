package video9.assignment;

import java.util.Scanner;

public class PerimeterOfParallelogram {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          /*
           * P = 2 (a + b), where a, b are the adjacent sides of a parallelogram
           * P = 2a + √(2x^2 + 2y^2 - 4a^2), where a is the a side of the parallelogram,
           * and
           * x, y are its diagonals.
           * P = 2a + 2h / sinθ, where a is the side of the parallelogram, h is the height
           * and θ is the angle of the parallelogram.
           */
          System.out.println("Enter the side of the paralalelogram :");
          float side = scn.nextFloat();
          System.out.println("Enter the Height of the paralalelogram :");
          float height = scn.nextFloat();
          System.out.println("Enter the angle of the paralalelogram :");
          double angleIndegree = scn.nextDouble();
          double angleInradian = Math.toRadians(angleIndegree);

          double perimeter = 2 * side + (2 * height / Math.sin(angleInradian));
          System.out.println("Perimeter of Parallelogram : " + perimeter);
          scn.close();

     }
}
