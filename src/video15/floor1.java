package video15;
public class floor1 {
     public static void main(String[] args) {
          int[] arr = {19,28,37,46,55,64,73,82,91,100};
          int target = 5;
          int ans = Floor(arr, target);
          System.out.println(ans);
     }
     static int Floor (int[] Arr , int Target){
          if(Target > Arr[Arr.length-1] || Target <Arr[0]){
               return -1;
          }
          int start = 0 ;
          int end = Arr.length -1 ;

          while (start <= end) {
               int mid = start + (end - start )/2;
               if (Arr[mid]== Target) {
                    return Arr[mid];
               }
               else if (Arr[mid]< Target) {
                    start = mid +1;
               }
               else{
                    end = mid -1;
               }
          }
          return Arr[end];
     }
}
