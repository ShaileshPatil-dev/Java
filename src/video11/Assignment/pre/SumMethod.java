package video11.Assignment.pre;

import java.util.Scanner;

public class SumMethod {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a number :");
          int num1 = scn.nextInt();
          System.out.println("Enter a number :");
          int num2 = scn.nextInt();
          ShowSum(num1,num2);
          scn.close();
     }
     static void ShowSum(int a , int b){
          System.out.println("Sum : "+(a+b));
     }
}
