package video25;

import java.util.Scanner;

public class PowerOf2 {
     public static void main(String[] args) {
          Scanner scn = new  Scanner(System.in);
          System.out.println("Enter a number");
          int num = scn.nextInt();
          // int count = 0;
          // while (num >0) {
          //      int ans = num&1;
          //      if (ans==1) {
          //           count++;
          //      }
          //      num = num >> 1;
          // }
          // if(count<2){
          //       System.out.println("True");}
          //       else{
          //           System.out.println("False");
          //       }


          // approch 2

          if ((num & (num-1))==0) {
               System.out.println("True");
          }
          else
          {
               System.out.println("False");
          }
          scn.close();
     }
}
