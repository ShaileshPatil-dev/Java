package video8.assignment;

import java.util.Scanner;

public class NumOperation {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          // Take in two numbers and an operator (+, -, *, /) and calculate the value.
          // (Use if conditions)
          System.out.println("Enter a first Number :");
          int number1 = scn.nextInt();
          System.out.println("Enter a first Number :");
          int number2 = scn.nextInt();
          System.out.println("Select the Operation : (+ - * /)");
          char operation = scn.next().charAt(0);

          if (operation == '+') {
               System.out.println("The Addition : " + (number1 + number2));
          } else if (operation == '-') {
               System.out.println("The Substraction : " + (number1 - number2));
          } else if (operation == '*') {
               System.out.println("The Multiplication : " + (number1 * number2));
          } else if (operation == '/') {
               System.out.println("The Devision : " + (number1 / number2));
          } else {
               System.out.println("Enter correct Operation ");
          }
          scn.close();

     }
}
