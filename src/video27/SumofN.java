package video27;

import java.util.Scanner;
public class SumofN {
public static void main(String[] args) {
// Factorial of a number
     Scanner scn = new Scanner(System.in);
     System.out.print("Enter a number : ");
     int num = scn.nextInt();
     scn.close();
     System.out.println(SumNum(num));
}
     static int SumNum (int n){
          if (n == 1) {
               return 1;
          }
          return n +SumNum(n-1);
     }
}
