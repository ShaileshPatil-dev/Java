package video11.Assignment;

import java.util.Scanner;

public class PalindromeMethod {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a number :");
          int number = scn.nextInt();
          Palindrome(number);
          scn.close();
     }
     static void Palindrome(int num){
          int copy = num ;
          int rem;
          int ans = 0;
          while (copy>0) {
               rem = copy%10 ; 
               ans = ans * 10 + rem ;
               copy/=10; 
          }
          if (num == ans) {
               System.out.println("A palindrome number");
          }
          else{
               System.out.println("Not a palindrome number");
          }
     }
}
