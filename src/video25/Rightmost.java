
package video25;

import java.util.Scanner;

public class Rightmost {

    public static void main(String[] args) {

        int counter = 0;
        boolean found = false;

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = scn.nextInt();

        while (num > 0) {

            counter++;

            if ((num & 1) == 1) {
                System.out.println("Right most set bit at " + counter);
                found = true;
                break;
            }

            num >>= 1;
        }

        if (!found) {
            System.out.println("-1");
        }

        scn.close();
    }
}