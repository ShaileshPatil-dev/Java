package video21;

import java.util.Scanner;

public class Test {
     public static void main(String[] args) {
          String name = new String();
          System.out.println("Enter your name :");
          Scanner scn = new Scanner(System.in);
          //name = scn.next();// this will take string till user use spacebar
          name = scn.nextLine();// this will take string till end 

          int lengthOfname = name.length();
          System.out.printf("Your name length is : %d \n",lengthOfname);

          String nameInuppercase = name.toUpperCase();
          String nameInlowercase = name.toLowerCase();
          System.out.println("Name in Uppercase :"+nameInuppercase);
          System.out.println("Name in Lowercase :"+nameInlowercase);

          String nameTrimmed = name.trim(); // remove the space from front and back of string , middle space in string will not get trimmed 
          System.out.println("Name without space :"+nameTrimmed);

          System.out.printf("My first name : %s",name.substring(0, 8));// it will start from 0 till 7 ; index 8 will not access
          scn.close();
     }
}
