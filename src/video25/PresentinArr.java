package video25;

// import java.util.HashMap;

public class PresentinArr {
     // Find the element in array that appeared only once
     public static void main(String[] args) {


// Brute force approach
     //      int[] arr = { 1, 4, 7, 5, 5, 1000, 7, 4, 1, 3, 6, 9, 3, 6, 9 };
     //        for (int i = 0; i < arr.length; i++) {
          //           int count = nCount(arr, arr[i]);
          //             if (count == 1) {
               //                System.out.println("Value : " + arr[i]);
               //                break;
               //           }
               //        }
               //   }
               // static int nCount(int[] arr, int element) {
                    //      int count = 0;
                    //      for (int i = 0; i < arr.length; i++) {
                         //           if (arr[i] == element) {
                              //                count++;
                              //           }
                              //      }
                              
                              //      return count;
                              
//hashmap approch
                              
     //   int[] nums = { 1,4,7,8,9,6,3,2,1,4,7,8,9,6,3,2,5 };
     //   HashMap<Integer,Integer> map = new HashMap<>();
     //        for(int i =0; i<nums.length ;i++){
     //             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
     //        }
     //        for(int i = 0 ; i< nums.length;i++){
     //             if(map.get(nums[i])==1){
     //              System.out.println("Element :"+nums[i]);
     //        }
     //    }

// XOR approch
          int[] arr = {1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1,10};
          int ans = 0;
          for (int i = 0; i < arr.length; i++) {
               ans = ans^arr[i];
          }
          System.out.println("Element : "+ans);
     }
}
