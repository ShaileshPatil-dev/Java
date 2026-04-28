package video8.assignment;

import java.util.Scanner;

public class SimpleIntrest {
     // Write a program to input principal, time, and rate (P, T, R) from the user
     // and find Simple Interest
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the Principle amount :");
          int PrincipleAmount = scn.nextInt();

          System.out.println("Enter the time priod ;");
          int time = scn.nextInt();

          System.out.println("Enter the rate of intrest :");
          float rate = scn.nextFloat();

          float SimpleIntrest = ((PrincipleAmount * time * rate) / 100);

          System.out.println("Simple Intrest : " + SimpleIntrest);
          scn.close();
     }
}
