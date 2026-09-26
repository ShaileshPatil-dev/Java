package video27;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
     // print N to 1 using recurrsion
     Scanner scn = new Scanner(System.in);
     System.out.println("Enter a number");
     int num = scn.nextInt();
     scn.close();
     nto1(num);
}
     static void nto1(int n){
          if (n == 0) {
               return;
          }
          System.out.println(n);
          nto1(n-1);
     }
}

/*
to use recurssion ask : 
1. what is return type (output)
2. what is input
3. what is base condition (condition which's ans we know)
4. next call formula
*/