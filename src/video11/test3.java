package video11;

import java.util.Scanner;

public class test3 {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter a number:");
          int a = scn.nextInt();
          System.out.println("Enter a number:");
          int b = scn.nextInt();

          swap(a, b);
          System.out.println("a"+a);
          System.out.println("a"+b);
          scn.close();
     }

     static void swap(int A, int B) {
         int tem = A ;
         A = B ;
         B = tem;
          System.out.println("A"+A);
          System.out.println("B"+B);
     }
}
