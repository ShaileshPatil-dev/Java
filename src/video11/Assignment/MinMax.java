package video11.Assignment;
import java.util.Scanner;
public class MinMax {
     public static void main(String[] args) {
          // Define two methods to print the maximum and the minimum number respectively
          Scanner scn = new Scanner(System.in);
System.out.println("Enter a number :");
          int A = scn.nextInt();
System.out.println("Enter a number :");
          int B = scn.nextInt();
System.out.println("Enter a number :");
          int C = scn.nextInt();
          int minimum = Min(A, B, C);
          int maximum = Max(A, B, C);
          System.out.println("The min is : " + minimum);
          System.out.println("The max is : " + maximum);
          scn.close();
     }

     static int Min(int a, int b, int c) {
          int min = a;

          if (b < min) {
               min = b;
          }

          if (c < min) {
               min = c;
          }
          return min;
     }

     static int Max(int a, int b, int c) {
          int max = a;

          if (b > max) {
               max = b;
          }

          if (c > max) {
               max = c;
          }
          return max;
     }
}