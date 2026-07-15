class Solution {
     public int[] searchRange(int[] nums, int target) {
          int[] ans = new int[2];
          ans[0] = Leftmost(nums, target);
          ans[1] = Rightmost(nums, target);
          return ans;
     }

     static int Leftmost(int[] nums, int target) {
          int index = -1;
          int start = 0;
          int end = nums.length - 1;

          while (start <= end) {
               int mid = start + (end - start) / 2;

               if (nums[mid] == target) {
                    index = mid;
                    end = mid - 1; // keep searching on the left
               } else if (nums[mid] > target) {
                    end = mid - 1;
               } else {
                    start = mid + 1;
               }
          }
 
          return index;
     }

     static int Rightmost(int[] nums, int target) {
          int index = -1;
          int start = 0;
          int end = nums.length - 1;

          while (start <= end) {
               int mid = start + (end - start) / 2;

               if (nums[mid] == target) {
                    index = mid;
                    start = mid + 1; // keep searching on the right
               } else if (nums[mid] > target) {
                    end = mid - 1;
               } else {
                    start = mid + 1;
               }
          }

          return index;
     }
}