package video6;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        if (number <= 1) {
            System.out.println("Neither Prime nor Composite");
        }

        boolean isPrime = true;
        int c = 2;

        while (c * c <= number) {
            if (number % c == 0) {
                isPrime = false;
                break;
            }
            c++;
        }

        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a Prime");
        }
        scn.close();
    }
}