package video28;

import java.util.ArrayList;

public class FindAllIndex {
     public static void main(String[] args) {
          int[] arr = {1,2,3,4,5,6,7,8,9,10,1};
          int target = 1;
          allPresent(arr, target, 0);
          System.out.println(list);
     }
     static ArrayList<Integer> list = new ArrayList<>();
     static void allPresent(int[] arr , int traget , int index ){
          // base condition 
          if (index == arr.length) {
               return ;
          }
          if (arr[index] == traget) {
               list.add(index);
          }
          allPresent(arr, traget, index+1);
     }
}
