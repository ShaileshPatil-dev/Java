package video27;

import java.util.Scanner;

public class ProductofDIgits {

     public static void main(String[] args) {

          Scanner scn = new Scanner(System.in);

          System.out.print("Enter a number : ");
          int num = scn.nextInt();

          scn.close();

          System.out.println(ProductOfN(num));
     }

     static int ProductOfN(int n) {

          if (n == 0) {
               return 1;
          }

          return (n % 10) * ProductOfN(n / 10);
     }
}