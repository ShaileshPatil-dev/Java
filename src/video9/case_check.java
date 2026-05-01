package video9;

import java.util.Scanner;

public class case_check {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a character :");
          char ch = scn.next().trim().charAt(0);
          // there is no such thing like scn.nextChar
          // next() will take a word , trim() will remove the spaces charAt(0) it will take the first character from that word

          if (ch >= 'a' && ch <= 'z' ) {
               System.out.println("Lower case");
          }
          else if (ch >= 'A' && ch <= 'Z') {
               System.out.println("Upper case");
          }
          else
          {
               System.out.println("Check again");
          }
          scn.close();
     }
}
