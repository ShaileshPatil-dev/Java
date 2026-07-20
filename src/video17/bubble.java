package video17;

import java.util.Arrays;

public class bubble {
     public static void main(String[] args) {
          int[] unsortedarray = {1,2,3,4,5,6,7,8,9};
          BubbleSort(unsortedarray);
          System.out.println(Arrays.toString(unsortedarray));
     }
     static void BubbleSort (int[] sortedarray){
          for (int i = 0; i < sortedarray.length-1; i++) {
               boolean flag = false;
               for (int j = 1; j <= sortedarray.length-1-i; j++) {
                    if (sortedarray[j]<sortedarray[j-1]) {
                         int temp = sortedarray[j];
                         sortedarray[j]= sortedarray[j-1];
                         sortedarray[j-1]= temp;
                         flag = true;
                    }
               }
               if (!flag) {
                    break;
               }
          }
     }
}
