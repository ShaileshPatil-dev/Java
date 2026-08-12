package video19;

import java.util.Arrays;

public class insertion {
public static void main(String[] args) {
     int[] array = {1,9,2,6,3,7,4,8};
     InsertionSort(array);
     System.out.println(Arrays.toString(array));
}
static void InsertionSort(int[] Array){
     for (int i = 0; i < Array.length-1; i++) {
          for (int j = i+1; j >0; j--) {
               if (Array[j]<Array[j-1]) {
                    int temp = Array[j-1];
                    Array[j-1]= Array[j];
                    Array[j]=temp;
               }
               else{
                    break;
               }
          }
     }
}
}
