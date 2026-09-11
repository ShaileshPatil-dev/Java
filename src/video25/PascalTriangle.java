package video25;

import java.util.Scanner;

public class PascalTriangle {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter the nth no you want to find");
          int n = scn.nextInt();
          scn.close();
          System.out.println("Ans : "+ (1<<n-1));
     }
}
