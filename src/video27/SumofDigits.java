package video27;

import java.util.Scanner;

public class SumofDigits {
public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
     System.out.print("Enter a number : ");
     int num = scn.nextInt();
     scn.close();
     System.out.println(SumofN(num));
}
     static int SumofN(int n){
         if(n <10){
          return n;
         }
         return SumofN(n/10)+ (n%10);
     }
}
