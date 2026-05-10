package video9.assignment;

import java.util.Scanner;

public class VowelOrConsonant {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter the charecter:");
          char ch = scn.next().trim().charAt(0);

          if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
               System.out.println("vovals");
          }
          else{
               System.out.println("Consoant");
          }
          scn.close();
     }
}
