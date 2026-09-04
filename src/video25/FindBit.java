package video25;

import java.util.Scanner;

public class FindBit {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter a number:");
          int num = scn.nextInt();

          System.out.println("Enter which nth bit you want to find:");
          int bit = scn.nextInt();
          int result = (num >> (bit - 1)) & 1;
          System.out.println("Bit: " + result);

          scn.close();
     }
}