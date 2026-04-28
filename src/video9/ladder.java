package video9;

import java.util.Scanner;

public class ladder {
     public static void main(String[] args) {
          System.out.println("Enter Salary");
          Scanner scn = new Scanner(System.in);
          int salary = scn.nextInt();
          // ladder if else
          if (salary < 10000) {
               salary = salary + 1000;
               System.out.println(salary);
          } else if (salary > 20000) {
               salary = salary + 2500;
               System.out.println(salary);
          } else {
               salary = salary + 2000;
               System.out.println(salary);
          }
     }
}
