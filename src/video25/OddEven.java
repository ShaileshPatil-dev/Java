package video25;
import java.util.Scanner;
public class OddEven {
     public static void main(String[] args) {
          // find the number is even or odd using bitwise operator
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a number :");
          int number = scn.nextInt();
          if ((number & 1) == 1) {
               System.out.println("Odd");
          }
          else{
               System.out.println("Even");
          }
          scn.close();
     }
}
