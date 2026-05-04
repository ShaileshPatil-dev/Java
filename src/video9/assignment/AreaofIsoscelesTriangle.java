package video9.assignment;

import java.util.Scanner;

public class AreaofIsoscelesTriangle {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the length of equal sides :");
          float length = scn.nextFloat();
          System.out.println("Enter the length of Base :");
          float base = scn.nextFloat();

          double area = 0.5 * base * Math.sqrt((Math.pow(length, 2) - (Math.pow(base, 2) / 4)));

          System.out.println("Area of isosceles Triangle is :" + area);
          scn.close();
     }
}
