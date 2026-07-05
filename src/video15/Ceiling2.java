package video15;

public class Ceiling2 {
     public static void main(String[] args) {
          // Que : find the smallest greatest that is greater than or equals to target
          // Decending order sorted array
          int[] arr = { 100, 91, 82, 73, 64, 55, 46, 37, 28, 19 };
          int target = 21;
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
               } else if (Arr[mid] < target) {
                    end = mid - 1;
               } else if (Arr[mid] > target) {
                    start = mid + 1;
               }
          }
          return Arr[start];
     }
}
