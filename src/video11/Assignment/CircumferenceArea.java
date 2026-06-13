package video11.Assignment;

import java.util.Scanner;

public class CircumferenceArea{
public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     
     // Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
     System.out.println("Enter the redius of the circle :");
     float redius = scn.nextFloat();
     CircleCircumference(redius);
     CircleArea(redius);
     scn.close();
}

static void CircleCircumference(float r) {
     double Circumference = 2 * Math.PI * r;
     System.out.println("Circumference : " + Circumference);
}

static void CircleArea(float r){
          double area = 2 * Math.PI * Math.pow(r, 2);
          System.out.println("The Area is : "+area);
      }
}
