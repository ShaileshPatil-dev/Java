package video26;

import java.util.ArrayList;
import java.util.Scanner;

public class FactorsOfNumber {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a number : ");
          int num = scn.nextInt();
          scn.close();
          FindFactors(num);
     }
     //sorted order + optimized 
     static void  FindFactors(int n){
     ArrayList<Integer> list = new ArrayList<>();
     for (int i = 1; i <= Math.sqrt(n); i++) {
               if(n%i==0){
                    if (n/i==i) {
                         System.out.print(i+" ");
                    }
                    else{
                         System.out.print(i+" ");
                         list.add(n/i);
     
               }
          }
     }
     for (int j = list.size() - 1; j >= 0; j--) {
          System.out.print(list.get(j) + " ");
     }

     // optimized but not sorted 
     // static void  FindFactors(int n){
     // for (int i = 1; i <= Math.sqrt(n); i++) {
     //           if(n%i==0){
     //                if (n/i==i) {
     //                     System.out.print(i+" ");
     //                }
     //                else{
     //                     System.out.print(i+" "+n/i+" ");
     //                }
     //           }
     //      }
     // }


     //brute force
     // static void  FindFactors(int n){
     //      for (int i = 1; i <=n; i++) {
     //           if(n%i==0){
     //                System.out.print(i+" ");
     //           }
     //      }
     // }
}
}
