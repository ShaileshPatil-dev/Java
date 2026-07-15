package video15;

public class floor2 {
     public static void main(String[] args) {
          int[] arr = {100, 91, 82, 73, 64, 55, 46, 37, 28, 19};
          int target = 56;
          int ans = Floor(arr, target);
          System.out.println(ans);
     }

     static int Floor(int[] Arr, int Target) {
          if (Target > Arr[Arr.length - 1] || Target < Arr[0]) {
               return -1;
          }
          int start = 0;
          int end = Arr.length - 1;
          while (start <= end) {
               int mid = start + (end - start) / 2;
               if (Arr[mid] == Target) {
                    return Arr[mid];
               } else if (Arr[mid] < Target) {
                    end = mid - 1;
               } else {
                    start = mid + 1;
               }
          }
         
          return Arr[start];
     }
}
