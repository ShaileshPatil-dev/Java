package video9.assignment;

import java.util.Scanner;

public class DiscountOfProduct {

     public static void main(String[] args) {

          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the name of product :");
          String name = scn.nextLine();

          System.out.println("Enter the original price of the product :");
          double price = scn.nextDouble();

          System.out.println("Enter the discount percentage :");
          double discount = scn.nextDouble();

          if (discount < 0 || discount > 100) {

               System.out.println("Invalid discount percentage");

          } else {

               double discount_amount = (price * discount) / 100;

               double final_price = price - discount_amount;

               System.out.println("-----------------------------------------------------");
               System.out.println("Product Name : " + name);
               System.out.println("Original Price : " + price);
               System.out.println("Discount Percentage : " + discount + "%");
               System.out.println("Discount Amount : " + discount_amount);
               System.out.println("Final Price : " + final_price);
          }

          scn.close();
     }
}