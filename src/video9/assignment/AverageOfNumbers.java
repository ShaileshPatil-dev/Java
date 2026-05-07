package video9.assignment;

import java.util.Scanner;

public class AverageOfNumbers {

     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter numbers (Enter 0 to exit)");

          int number = scn.nextInt(); // first input
          int sum = 0;
          int counter = 0;
          while (number != 0) {
               sum += number;
               counter++;
               number = scn.nextInt();
          }

          // check division by zero
          if (counter == 0) {
               System.out.println("No numbers entered");
          } else {
               double avg = (double) sum / counter;
               System.out.println("Average Of " + counter + " Numbers is " + avg);
          }
          scn.close();
     }
}