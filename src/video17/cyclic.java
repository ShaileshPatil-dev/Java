package video17;

import java.util.Arrays;

public class cyclic {
public static void main(String[] args) {
     int[] unsortedRange ={5,3,2,1,4};
     CyclicSort(unsortedRange);
     System.out.println(Arrays.toString(unsortedRange));
}
static void CyclicSort(int[] arr){
     int i = 0;
     while (i<arr.length) {
          int correctindex = arr[i]-1;
          if (arr[i]!=arr[correctindex]) {
               int temp = arr[i];
               arr[i] = arr[correctindex];
               arr[correctindex]=temp;
          }
          else{
               i++;
          }
     }
}
}
