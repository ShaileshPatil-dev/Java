package video11;

import java.util.Scanner;


public class test2 {
     public static void main(String[] args) {
          String name = askname();
          System.out.println("hello " + name);
     
          int sum = sum(22, 45);
          System.out.println("Sum :"+sum);

     }

     static String askname() {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter your name :");
          String name = scn.nextLine();
          scn.close();
          return name;
     }
     
     static int sum(int a , int b){
          int sum = a + b ;
          return sum ;
     }
}
