package video15;

public class Celing1 {
     public static void main(String[] args) {
          // Que : find the smallest greatest that is greater than or equals to target
          // Accending order sorted array

          int[] arr = { 19, 28, 37, 46, 55, 64, 73, 82, 91, 100 };
          int target = 72;
          int ans = Ceiling(arr, target);
          System.out.println(ans);
     }

     static int Ceiling(int[] Arr, int target) {
          int start = 0;
          int end = Arr.length - 1;
          while (start <= end) {
               int mid = start + (end - start) / 2;
               if (Arr[mid] == target) {
                    return Arr[mid];
               } else if (Arr[mid] > target) {
                    end = mid - 1;
               } else if (Arr[mid] < target) {
                    start = mid + 1;
               }
          }
          return Arr[start];
     }
}
