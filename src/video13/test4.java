package video13;

public class test4 {
      public static void main(String[] args) {
          int[] arr = {100,25,64,91,58,21,35,66,76,59,54,55,33,-2,55,3,11,154,75};
          System.out.println( Findmin(arr));
      }
      static int Findmin(int[] Arr){
          int min = Integer.MAX_VALUE;
          for (int i = 0; i < Arr.length; i++) {
               if (min > Arr[i]) {
                    min = Arr[i];
               }
          }
          return min;
      }
}
