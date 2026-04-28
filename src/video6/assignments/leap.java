package video6.assignments;

import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        System.out.println("Enter a year :");
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        if (year % 4 == 0) {
            System.out.println("Leap year");

        } else {
            System.out.println("Not a Leap year");
        }
        scn.close();
    }
}
