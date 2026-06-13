package video11.Assignment;

import java.util.Scanner;

public class Marks {
     public static void main(String[] args) {
          // Write a program that will ask the user to enter his/her marks (out of 100).
          // Define a method that will display grades according to the marks entered as
          // below:
          /*
           * Marks Grade
           * 91-100 AA
           * 81-90 AB
           * 71-80 BB
           * 61-70 BC
           * 51-60 CD
           * 41-50 DD
           * <=40 Fail
           */
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter your marks");
          int marks = scn.nextInt();
          if (marks <= 100 && marks >= 0) {
               Grade(marks);
          } else {
               System.out.println("Enter correct marks");

          }
          scn.close();
     }

     static void Grade(int marks) {
          if (marks <= 100 && marks > 90) {
               System.out.println("AA");
          } else if (marks <= 90 && marks > 80) {
               System.out.println("AB");
          } else if (marks <= 80 && marks > 70) {
               System.out.println("BB");
          } else if (marks <= 70 && marks > 60) {
               System.out.println("BC");
          } else if (marks <= 60 && marks > 50) {
               System.out.println("CD");
          } else if (marks <= 50 && marks > 40) {
               System.out.println("CD");
          } else {
               System.out.println("Fail");
          }
     }
}