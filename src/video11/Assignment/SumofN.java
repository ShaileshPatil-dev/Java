package video11.Assignment;

import java.util.Scanner;

public class SumofN {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          // Write a function that returns the sum of first n natural numbers.
          System.out.println("Enter the number : ");
          int num = scn.nextInt();

          SumOfNaturalNo(num);
          scn.close();
     }
     static void SumOfNaturalNo(int n){
          int sum = 0 ;
          for (int i = 1; i <=n; i++) {
               sum+=i;
          }
          System.out.println("Sum = "+sum);
     }
}
