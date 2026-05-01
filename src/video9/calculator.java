package video9;

import java.util.Scanner;

public class calculator {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          int ans = 0;
          while (true) {
               System.out.println("Enter a operator");
               char op = scn.next().trim().charAt(0);

               if (op =='+' || op =='-' || op =='*' || op == '/' || op == '%') {
                    System.out.println("Enter a num (1)");
                    int num1 = scn.nextInt();
                    System.out.println("Enter a num (1)");
                    int num2 = scn.nextInt();

                    if (op =='+') {
                        ans = num1 + num2;
                        System.out.println(ans);
                    }
                    else if (op =='-') {
                        ans = num1 - num2;
                        System.out.println(ans);
                    }
                    else if (op =='/') {
                        ans = num1 / num2;
                        System.out.println(ans);
                    }
                    else if (op =='*') {
                        ans = num1 * num2;
                        System.out.println(ans);
                    }
                    else if (op =='%') {
                        ans = num1 % num2;
                        System.out.println(ans);
                    }
               }
               else if (op == 'x' || op =='X') {
                    break;
                    
               }
               else
               {
                    System.out.println("Enter correct operator else for exit enter x/X");
               }
          }
         scn.close(); 
     }
}
