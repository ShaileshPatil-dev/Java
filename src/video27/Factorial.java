package video27;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
// Factorial of a number
     Scanner scn = new Scanner(System.in);
     System.out.print("Enter a number : ");
     int num = scn.nextInt();
     scn.close();
     System.out.println(FactorialofN(num));
}
     static int FactorialofN (int n){
          if (n <= 1) {
               return 1;
          }
          return n * FactorialofN(n -1); 
     }
}
