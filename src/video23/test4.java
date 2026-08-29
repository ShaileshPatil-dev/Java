package video23;

import java.util.Scanner;

public class test4 {
     public static void main(String[] args) {
          // Write a function from 0 to n (take input from user )
          Scanner scn = new Scanner(System.in);
          System.out.print("Enter a number : ");
          int n = scn.nextInt();
          PrintN(0,n);
          scn.close();

     }
     static void PrintN(int start, int n){
          if(start >n){  
               return;
          }
          System.out.println(start);
          PrintN(start+1,n);
     }
}
