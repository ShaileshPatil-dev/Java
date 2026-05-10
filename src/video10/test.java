package video10;
import java.util.Scanner;
public class test {
     public static void main(String[] args) {
          // switch 
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter the fruit name : mango/ornage/grapes/apple/pineapple");
          String fruit = scn.next();

          switch (fruit) {
               case "mango" :
                    System.out.println("You choose mango ...tell me why ?");
                    break;
               case "ornage" :
                    System.out.println("You choose ornage ...tell me why ?");
                    break;
               case "grapes" :
                    System.out.println("You choose grapes ...tell me why ?");
                    break;
               case "apple" :
                    System.out.println("You choose apple ...tell me why ?");
                    break;
               case "pineapple" :
                    System.out.println("You choose pineapple ...tell me why ?");
                    break;
          
               default:
                    System.out.println("Enter the correct fruit name");
                    break;
          }
          scn.close();
     }
}
