package video25;

import java.util.Scanner;

public class XorFromZero {
public static void main(String[] args) {
     Scanner scn = new  Scanner(System.in);
     System.out.println("Enter a number : ");
     int num = scn.nextInt();

     if (num%4==0) {
          System.out.println("Ans : "+num);
     }
     else if (num %4 == 1) {
          System.out.println("Ans : 1");
     }
     else if (num %4 ==2) {
          System.out.println("Ans : "+ (num+1));
     }
     else{
          System.out.println("0");
     }
     scn.close();
}
}
