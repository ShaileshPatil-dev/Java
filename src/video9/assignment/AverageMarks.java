package video9.assignment;

import java.util.Scanner;

public class AverageMarks {
     public static void main(String[] args) {

          Scanner scn = new Scanner(System.in);

          System.out.println("Enter no of subjects :");
          int subjects = scn.nextInt();

          float sum = 0;

          System.out.println("Enter marks :");

          for (int i = 1; i <= subjects; i++) {

               float marks = scn.nextFloat();

               sum += marks;
          }

          float average = sum / subjects;

          System.out.printf("Avg of marks : %.2f", average);

          scn.close();
     }
}