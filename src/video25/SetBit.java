package video25;

import java.util.Scanner;

public class SetBit {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a number :");
          int number = scn.nextInt();
          System.out.println("Enter which bit you want to set :");
          int bit = scn.nextInt();
          int result = number | 1 << (bit-1);
          System.out.println(result);
          scn.close();
     }
}
