package video9.assignment;

import java.util.Scanner;

public class ReverseAString {

     public static void main(String[] args) {

          Scanner scn = new Scanner(System.in);

          System.out.println("Enter a word :");

          String s = scn.next();

          String r = "";

          // reverse
          for (int i = s.length() - 1; i >= 0; i--) {

               r += s.charAt(i);
          }

          System.out.println(r);

          scn.close();
     }
}