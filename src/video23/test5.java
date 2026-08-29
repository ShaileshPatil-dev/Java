package video23;

import java.util.Scanner;

public class test5 {
     public static void main(String[] args) {
          // Find the nth fibonachhi number 
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a number : ");
          int n = scn.nextInt();
          System.out.println(Fib(n));
          scn.close();
     }
     static int Fib(int n){
          // base condition 
          if (n<2) {
               return n;
          }
          return Fib(n-1) + Fib(n-2);
     }
     
}
