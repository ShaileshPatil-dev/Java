package video8.assignment;

import java.util.Scanner;

public class Pal {
     public static void main(String[] args) {
          System.out.println("Enter a word to check that its palindrome or not :");
          Scanner scn = new Scanner(System.in);
          String Str = scn.next();

          // here we dont know the fix amount of loop so we will use the while loop 
          int i = 0 ;
          int j = Str.length()- 1;
          while (i < j){
               if (Str.charAt(i)!=Str.charAt(j)) {
                    System.out.println("Not a palindrome");
                    System.exit(0);
               }
               i++;
               j--;
          }
          System.out.println("A Palindrome");
          scn.close();
     }
}
