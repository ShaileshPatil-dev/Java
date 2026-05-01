package video9;

import java.util.Scanner;

public class print_hello_world {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the number :");
          int number = scn.nextInt();

          for (int i = 1; i <= number; i++) {
               System.out.println("Hello World !");
          }
          scn.close();
     }
}
