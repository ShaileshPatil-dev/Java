package video28;

public class LinearSearch {
     public static void main(String[] args) {
          int[] arr = { 1, 45, 6, 9, 7, 83, 5, 77, 51, 66 };
          int goal = 51;
          System.out.println(isPresent(arr, goal, 0));
          System.out.println(findIndex(arr, goal, 0));
     }

     static int findIndex(int[] arr, int target, int index) {
          // base condition
          if (index == arr.length) {
               return -1;
          }
          if (arr[index] == target) {
               return index;
          }
          return findIndex(arr, target, index + 1);
     }
     static boolean isPresent(int[] arr, int target, int index) {
          // base condition
          if (index == arr.length) {
               return false;
          }
          if (arr[index] == target) {
               return true;
          }
          return isPresent(arr, target, index + 1);
     }


}
