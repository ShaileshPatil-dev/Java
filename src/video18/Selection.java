package video18;

import java.util.Arrays;

public class Selection {

     public static void main(String[] args) {
          int[] unsortedarray = { 19, 73, 64, 28, 55 };
          SelectionSort(unsortedarray);
          System.out.println(Arrays.toString(unsortedarray));
     }

     static void SelectionSort(int[] array) {
          for (int i = 0; i < array.length; i++) {
               int lastPosition = array.length - i - 1;
               int max = FindMax(array, 0, lastPosition);
               int temp = array[lastPosition];
               array[lastPosition] = array[max];
               array[max] = temp;
          }
     }

     static int FindMax(int[] array, int start, int end) {
          int max = start;
          for (int i = start; i <= end; i++) {
               if (array[i] > array[max]) {
                    max = i;
               }
          }

          return max;
     }
}