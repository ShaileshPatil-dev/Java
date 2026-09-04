package video25;

import java.util.Scanner;

public class NegativeNo {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a Postive number :");
          int num = scn.nextInt();
          int ans = ((~num)+1);
          System.out.println("Negative :"+ans);
          scn.close();
     }
}
