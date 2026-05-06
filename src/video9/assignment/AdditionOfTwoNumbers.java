package video9.assignment;
import java.util.Scanner;
public class AdditionOfTwoNumbers {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int num1, num2;
          System.out.println("Enter the number :");
          num1 = scn.nextInt();
          System.out.println("Enter the number :");
          num2 = scn.nextInt();

          int sum = num1 + num2;

          System.out.println("Sum :" + sum);
          scn.close();
     }
}
