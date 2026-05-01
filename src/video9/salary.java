package video9;

import java.util.Scanner;

public class salary {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter your salary");
          int salary = scn.nextInt();
          /*
           * if (salary > 10000) {
           * salary = salary + 2000; // bonous
           * } else {
           * salary = salary + 1000;
           * }
           */
          if (salary > 10000) {
               salary = salary + 2000;
          } else if (salary > 20000) {
               salary = salary + 3000;
          } else {
               salary = salary + 1000;
          }
          scn.close();
     }
}

/*
 * if else syntax :
 * 
 * if(boolen condition T/F)
 * {
 * do this if True
 * }
 * else
 * {
 * do this if F
 * }
 */