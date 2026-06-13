package video11.Assignment;

import java.util.Scanner;

public class EvenOdd {
public static void main(String[] args) {
     // Define a program to find out whether a given number is even or odd.
     Scanner scn = new Scanner(System.in);
     System.out.println("Enter a number:");
     int number = scn.nextInt();
     EvenOddNum(number);
     scn.close();
}

static void EvenOddNum (int num) {
     if (num % 2 == 0) {
          System.out.println("Even");
     } else {
          System.out.println("Odd");
     }
}

}
