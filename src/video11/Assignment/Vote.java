package video11.Assignment;
import java.util.Scanner;

public class Vote {
     public static void main(String[] args) {
          // A person is eligible to vote if his/her age is greater than or equal to 18.
          // Define a method to find out if he/she is eligible to vote.
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter your age :");
          int age = scn.nextInt();
          CanVote(age);
          scn.close();
     }
     
     static void CanVote(int age) {
          if (age >= 18) {
               System.out.println("Eligible to Vote");
          } else {
               System.out.println("Not eligible to Vote");
          }
     }
}
