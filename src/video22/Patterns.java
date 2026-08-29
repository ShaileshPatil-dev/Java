package video22;

public class Patterns {
     public static void main(String[] args) {
          pattern1(5);
          Pattern2(5);
          Pattern3(5);
          Pattern4(5);
          Pattern5(5);
          Pattern6(5);
          Pattern7(5);
          Pattern8(5);
          Pattern9(5);
          Pattern10(5);
          Pattern11(5);
          Pattern12(5);
          Pattern13(5);
     }

     static void pattern1(int n) {
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++) {
                    System.out.print("#  ");
               }
               System.out.println("");
          }
     }

     static void Pattern2(int n) {
          for (int i = 0; i < n; i++) {
               for (int j = 0; j <= i; j++) {
                    System.out.print("*  ");
               }
               System.out.println("");
          }
     }

     static void Pattern3(int n) {
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < n - i; j++) {
                    System.out.print("$  ");
               }
               System.out.println("");
          }
     }

     static void Pattern4(int n) {
          for (int i = 0; i < n; i++) {
               for (int j = 1; j <= i + 1; j++) {
                    System.out.print(j + " ");
               }
               System.out.println(" ");
          }
     }

     static void Pattern5(int n) {
          for (int i = 1; i <= (2 * n) - 1; i++) {
               if (i <= n) {
                    for (int j = 1; j <= i; j++) {
                         System.out.print("* ");
                    }
                    System.out.println(" ");
               } else if (i > n) {
                    for (int j = 0; j < n - (i - n); j++) {
                         System.out.print("* ");
                    }
                    System.out.println("");
               }
          }
     }

     static void Pattern6(int n) {
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
               }
               for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
               }
               System.out.println(" ");
          }
     }

     static void Pattern7(int n) {
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < i; j++) {
                    System.out.print(" ");
               }
               for (int j = 0; j < n - i; j++) {
                    System.out.print("*");
               }
               System.out.println(" ");
          }
     }

     static void Pattern8(int n) {
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
               }
               for (int j = 0; j < i * 2 + 1; j++) {
                    System.out.print("*");
               }
               System.out.println(" ");
          }
     }

     static void Pattern9(int n) {
          for (int i = 0; i < n; i++) {
               for (int j = 0; j <=i; j++) {
                    System.out.print(" ");
               }
               for (int j = 1; j <=2*n -2 * i -1; j++) {
                    System.out.print("*");
               }
               System.out.println(" ");
          }
     }

     static void Pattern10(int n){
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
               }
               for (int j = 0; j < i+1; j++) {
                    System.out.print(" *");
               }
               System.out.println(" ");
          }
     }

     static void Pattern11(int n){
          for (int i = 0; i < n; i++) {
               for (int j = 0; j <= i; j++) {
                    System.out.print(" ");
               }
               for (int j = 0; j < n-i; j++) {
                    System.out.print("* ");
               }
               System.out.println(" ");
          }
     }
     

     static void Pattern12(int n){
          for (int i = 0; i < 2*n+1; i++) {
              if (i<n) {
               for (int j = 0; j < i; j++) {
                    System.out.print(" ");
               }
               for (int j = 0; j < n -i; j++) {
                    System.out.print("* ");
               }
               System.out.println(" ");
              } 
              else if(i>n){
               for (int j = 0; j < 2*n - i; j++) {
                    System.out.print(" ");
               }
               for (int j = 0; j < i- n; j++) {
                    System.out.print("* ");
               }
               System.out.println(" ");
              }
          }
     }

     static void Pattern13(int n){
          for (int i = 1; i <=n; i++) {
               if(i==1){
                    for (int j = 0; j < n - 1; j++) {
                         System.out.print(" ");
                    }
                    System.out.print("*");
                    System.out.println(" ");
               }
               else if (i > 1 && i< n){
                    for (int j = 0; j < n-i; j++) {
                         System.out.print(" ");
                    }
                    for (int j = 0; j < 1; j++) {
                         System.out.print("*");  
                    }
                    for (int j = 1; j <(2*i)-2; j++) {
                         System.out.print(" ");
                    }
                    for (int j = 0; j < 1; j++) {
                         System.out.print("*");   
                    }
                    System.out.println(" ");
               } 
               else if(i == n) {
                for (int j = 0; j <(2* n)-1; j++) {
                     System.out.print("*");
                }
               }
          }
     }
}
