package video11;

import java.util.Scanner;

public class test {
     public static void main(String[] args) {
          // methods (functions)
          greet(); // function call
          sum();
          // methods that will return the value
          int ans = sum2();
          System.out.println(ans);
     }

     static int sum2() {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a number :");
          int num1 = scn.nextInt();
          System.out.println("Enter a number :");
          int num2 = scn.nextInt();
          int sum = num1 + num2;
          scn.close();
          return sum; // end and always be last
     }

     static void sum() {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a number :");
          int num1 = scn.nextInt();
          System.out.println("Enter a number :");
          int num2 = scn.nextInt();
          int sum = num1 + num2;
          System.out.println("Sum :" + sum);
          scn.close();
     }

     static void greet() {
          System.out.println("Hello !");
     }
}
