package video13;

public class test6 {
     public static void main(String[] args) {
          int[][] arr = {
               {1,2,3},{44,55,66,},{77,888,99} };
          System.out.println(ArrayMax(arr));
          System.out.println(ArrayMin(arr));
     }
     static int  ArrayMax(int[][] Arr){
          int max = Integer.MIN_VALUE;
          for (int i = 0; i < Arr.length; i++) {
               for (int j = 0; j < Arr[i].length; j++) {
                    if (max < Arr[i][j]) {
                         max = Arr[i][j];
                    }
               }
          }
          return max ;
     }
     static int  ArrayMin(int[][] Arr){
          int min = Integer.MAX_VALUE;
          for (int i = 0; i < Arr.length; i++) {
               for (int j = 0; j < Arr[i].length; j++) {
                    if (min > Arr[i][j]) {
                         min = Arr[i][j];
                    }
               }
          }
          return min;
     }
}
