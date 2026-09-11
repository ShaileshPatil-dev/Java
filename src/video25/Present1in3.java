package video25;

public class Present1in3 {

     public static void main(String[] args) {

          int[] nums = {
                    1, 5, 9, 6, 3, 2,
                    1, 5, 9, 6, 3, 2,
                    7,
                    1, 5, 9, 6, 3, 2
          };

          int ans = 0;

          // Check all 32 bits
          for (int i = 0; i < 32; i++) {

               int count = 0;

               // Check every number in the array
               for (int j = 0; j < nums.length; j++) {

                    // Check whether bit i is set in nums[j]
                    if ((nums[j] & (1 << i)) != 0) {
                         count++;
                    }
               }

               // If the count is not divisible by 3,
               // this bit belongs to the unique number
               if (count % 3 != 0) {
                    ans = ans | (1 << i);
               }
          }

          System.out.println("Unique number: " + ans);
     }
}