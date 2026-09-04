package video25;

import java.util.Scanner;

public class FIndBit2 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int mask = 1;

        System.out.println("Enter a number:");
        int number = scn.nextInt();

        System.out.println("Which bit you want to find:");
        int bitno = scn.nextInt();

        mask = mask << (bitno - 1);

        System.out.println("Bit: " + ((number & mask) >> (bitno - 1)));

        scn.close();
    }
}