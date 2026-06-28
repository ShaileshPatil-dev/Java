package video13;

import java.util.Arrays;
public class test5 {
     public static void main(String[] args) {
          int[][] myarr = {
                    { 1, 2, 3, 6 },
                    { 4, 7, 8, 9 },
                    { 1, 5, 6, 9 }
          };

          int target = 9;

          System.out.println(Arrays.toString(FindElementPosition(myarr, target)));
     }

     static boolean FindElement(int[][] Arr, int goal) {
          for (int i = 0; i < Arr.length; i++) {
               for (int j = 0; j < Arr[i].length; j++) {
                    if (Arr[i][j] == goal) {
                         return true;
                    }
               }
          }
          return false;
     }

     static int[] FindElementPosition(int[][] Arr, int goal) {
          for (int i = 0; i < Arr.length; i++) {
               for (int j = 0; j < Arr[i].length; j++) {
                    if (Arr[i][j] == goal) {
                         return new int[] { i, j };
                    }
               }
          }
          return new int[] { -1, -1 };
     }
}