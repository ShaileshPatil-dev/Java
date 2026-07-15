package video15;
public class Celing1 {
     public static void main(String[] args) {
          // Que : find the smallest element that is greater than or equals to Target
          // Accending order sorted array

          int[] arr = { 19, 28, 37, 46, 55, 64, 73, 82, 91, 100 };
          int target = 59;
          int ans = Ceiling(arr, target);
          System.out.println(ans);
     }

     static int Ceiling(int[] Arr, int Target) {
          if (Target > Arr[Arr.length - 1] || Target < Arr[0]) {
               return -1;
          }
          int start = 0;
          int end = Arr.length - 1;
          while (start <= end) {
               int mid = start + (end - start) / 2;
               if (Arr[mid] == Target) {
                    return Arr[mid];
               } else if (Arr[mid] > Target) {
                    end = mid - 1;
               } else if (Arr[mid] < Target) {
                    start = mid + 1;
               }
          }
          if (start == -1 && end == 0 || start == Arr.length - 1 && end == Arr.length) {
               return -1;
          }
          return Arr[start];
     }
}
