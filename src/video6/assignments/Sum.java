package video6.assignments;

import java.util.Scanner;

public class Sum {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a number :");
          int num1 = scn.nextInt();
          System.out.println("Enter a number :");
          int num2 = scn.nextInt();
          System.out.println("Sum :"+(num1+num2));
          scn.close();
     }
}
