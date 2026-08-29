package video23;

public class test6 {
     public static void main(String[] args) {
          //Binary search using the recurssion
          int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
          int find = 1;
          int start = 0;
          int end = arr.length-1;
          int index = BS(arr,find, start, end);
          System.out.println("Ans :"+index);

     }
     static int BS(int[] arr , int find, int start , int end){
          if(start > end){
               return -1;
          }
          int mid = (start )+( end - start)/2;
          if(arr[mid]==find){
               return mid;
          }
          if(arr[mid]>find){
               end = mid-1;
               return BS(arr, find, start, end);
          }
          if(arr[mid]<find){
               start = mid+1;
              return BS(arr, find, start, end);
          }
          return -1;
     }
}
