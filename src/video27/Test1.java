package video27;
import java.util.Scanner;

public class Test1 {
public static void main(String[] args) {
     // print 1 to N using recurrsion
     Scanner scn = new Scanner(System.in);
     System.out.print("Enter a number : ");
     int num = scn.nextInt();
     scn.close();
     OnetoN(num);
}
     static void OnetoN(int n){
          if (n == 0) {
               return;
          }
          OnetoN(n-1);
          System.out.println(n);
     }
}

/*
to use recurssion ask : 
1. what is return type (output)
2. what is input
3. what is base condition (condition which's ans we know)
4. next call formula
*/