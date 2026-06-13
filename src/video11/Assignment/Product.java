package video11.Assignment;

import java.util.Scanner;

public class Product {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a number: ");
          int A = scn.nextInt();
          System.out.println("Enter a number: ");
          int B = scn.nextInt();
          int product = ProductAns(A, B);
          System.out.println("The Product is : " +product);
          scn.close();
     }
     
     static int ProductAns(int a, int b) {
          int product = a * b;
          return product;
     }
}
