import java.util.Arrays;
public class MergeSort2 {
     public static void main(String[] args) {
          int[] arr = { 1, 9, 8, 2, 3, 7, 4, 6, 5, 10 };
          Msort(arr, 0, arr.length - 1);
          System.out.println(Arrays.toString(arr));
     }

     static void Msort(int[] arr, int start, int end) {
          if (start >= end) {
               return;
          }
          int mid = (start + end) / 2;
          Msort(arr, start, mid);
          Msort(arr, mid + 1, end);
          Merge(arr, start, mid, end);
     }

     private static void Merge(int[] arr, int start, int mid, int end) {
          int[] mix = new int[end - start];
          int i = start;
          int j = end;
          int k = 0;
          while (i < mid && j < end) {
               if (arr[i] > arr[j]) {
                    mix[k++] = arr[i++];
               } else {
                    mix[k++] = arr[j++];
               }
          }
          while (i < mid) {
               mix[k++] = arr[i++];
          }
          while (j < end) {
               mix[k++] = arr[j++];
          }
          for (int x = 0; x < mix.length; x++) {
               arr[start + x] = mix[x];
          }
     }
}