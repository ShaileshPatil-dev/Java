package video14;

public class BinarySearch2 {
     // Binary Search Algorithum for the Decending order Array
     public static void main(String[] args) {
          int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
          int target = 5;
          int index = BinaryS(arr, target);
          System.out.println(index);
     }
     static int BinaryS(int[] Arr , int Goal){
          int start =0 ;
          int end = Arr.length - 1 ;
          while (end > start){
               int mid = start + (end - start)/2;
               if(Arr[mid]==Goal){
                    return mid ;
               }
               else if(Goal > Arr[mid]){
                    end = mid -1;
               }
               else if(Goal < Arr[mid]){
                    start = mid +1;
               }
          }
          return -1;
     }
}
