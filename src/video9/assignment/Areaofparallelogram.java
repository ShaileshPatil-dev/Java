package video9.assignment;

import java.util.Scanner;

public class Areaofparallelogram {
     public static void main(String[] args) {
          // there are ways to calculate the area of the parallelogram :
          // area = b*h (here b is base length and h is perpendicular height )
          // area = a * b * sin(degree theta) (here a and b are adjecent side and degree
          // theta is the angle beteween them )
          // area = 0.5 *a * b * sin(degree theta) (here the a and b are diagonals of
          // parallelogram and degree theta is angle between them)

          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the length of ajecent side (A) :");
          float sideA = scn.nextFloat();
          System.out.println("Enter the length of ajecent side (B) :");
          float sideB = scn.nextFloat();

          System.out.println("Enter the angle between ajecent side :");
          double AngleIndegree = scn.nextDouble();
          double AngleInradian = Math.toRadians(AngleIndegree);

          double area = sideA * sideB * Math.sin(AngleInradian);
          System.out.println("The area of parallelogram is :" + area);

          scn.close();

     }
}
