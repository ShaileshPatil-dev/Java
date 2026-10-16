package video28;

public class FindIndex {
     public static void main(String[] args) {
          int[] arr = { 1, 45, 6, 9, 7, 83, 5, 1, 77, 51, 66 };
          int goal = 1;
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
}
