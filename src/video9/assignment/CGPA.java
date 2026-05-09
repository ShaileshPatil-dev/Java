package video9.assignment;

import java.util.Scanner;

public class CGPA {
     public static void main(String[] args) {

          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the no of subjects :");
          int subjects = scn.nextInt();

          int sum = 0;

          for (int i = 1; i <= subjects; i++) {

               System.out.println("Enter the marks of subject " + i + " :");

               int marks = scn.nextInt();

               sum += marks;
          }

          double cgpa = (double) sum / subjects;

          System.out.println("CGPA : " + cgpa);

          scn.close();
     }
}