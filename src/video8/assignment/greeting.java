package video8.assignment;

import java.util.Scanner;

public class greeting {
     // take name as input and print a greeting message for that particular name.
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter Name : ");
          String name = scn.nextLine();
          System.out.println("Hello " + name);
          scn.close();
     }
}
