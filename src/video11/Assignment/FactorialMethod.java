package video11.Assignment;
import java.util.Scanner;

public class FactorialMethod {

     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.print("Enter a number: ");
          int number = scn.nextInt();
          factorial(number);
          scn.close();
     }

     static void factorial(int num) {
          int fact = 1;
          for (int i = 1; i <= num; i++) {
               fact *= i;
          }
          System.out.print(num + "! = ");
          for (int i = 1; i <= num; i++) {
               System.out.print(i);
               if (i < num) {
                    System.out.print(" * ");
               }
          }
          System.out.println(" = " + fact);
     }
}