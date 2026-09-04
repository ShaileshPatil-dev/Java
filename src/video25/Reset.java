package video25;

import java.util.Scanner;

public class Reset {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a number :");
          int num = scn.nextInt();
          System.out.println("Enter the bit you want to reset :");
          int bitno = scn.nextInt();
          System.out.println("Ans : "+(num & ~(1<<(bitno-1))));
          scn.close();
     }
}
