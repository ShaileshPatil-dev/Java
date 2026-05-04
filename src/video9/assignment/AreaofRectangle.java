package video9.assignment;

import java.util.Scanner;

public class AreaofRectangle {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the length of rectangle");
          float length = scn.nextFloat();
          System.out.println("Enter the width of rectangle");
          float width = scn.nextFloat();

          float area = length*width;
          System.out.println("The area of Rectangle : "+area);

          scn.close();
     }
}
