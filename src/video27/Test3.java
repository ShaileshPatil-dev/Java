package video27;

import java.util.Scanner;

public class Test3 {
public static void main(String[] args) {
     // print N to 1 and 1 to N using recurrsion
     Scanner scn = new Scanner(System.in);
     System.out.print("Enter a number : ");
     int num = scn.nextInt();
     scn.close();
     OnetoN(num);
}
     static void OnetoN(int n){
          if (n == 0) {
               return;
          }
          System.out.println(n);
          OnetoN(n-1);
          System.out.println(n);
     }
}
