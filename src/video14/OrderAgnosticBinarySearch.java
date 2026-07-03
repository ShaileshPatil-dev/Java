package video14;

public class OrderAgnosticBinarySearch {
     public static void main(String[] args) {
          int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
          int target = 5;
          boolean order = arr[0] < arr[arr.length-1];
          int index = BinaryS(arr, target , order);
          System.out.println(index);
     }
     static int BinaryS(int[] Arr , int Goal, boolean order){
          int start =0 ;
          int end = Arr.length - 1 ;
          while (end > start){
               int mid = start + (end - start)/2;
               if(Arr[mid]==Goal){
                    return mid ;
               }
               if(order){

                    if (Goal < Arr[mid]) {
                         end = mid - 1;
                    } else if (Goal > Arr[mid]) {
                         start = mid + 1;
                    }
               }
               else{
                    if (Goal > Arr[mid]) {
                         end = mid - 1;
                    } else if (Goal < Arr[mid]) {
                         start = mid + 1;
                    }
               }

          }
          return -1;
     }
}
