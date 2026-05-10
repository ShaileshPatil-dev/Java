package video9.assignment;

public class WordProblem1 {

     public static void main(String[] args) {
          // Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

          int aug_days = 31;
          int can_go_out = 0;

          for (int i = 1; i <= aug_days; i++) {

               if (i % 2 == 0) {
                    can_go_out++;
               }
          }

          System.out.println("Number of days he can go out: "
                    + can_go_out);
     }
}