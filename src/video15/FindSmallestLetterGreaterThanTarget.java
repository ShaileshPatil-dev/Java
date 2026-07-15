package video15;
public class FindSmallestLetterGreaterThanTarget {
     /*
     Given:
     array = ['a','d','h','l','q','u','v']; // sorted 
     target = z;
     Array is wrap around : if the target is z and cannot findout that in array then return first element 
     */
    public static void main(String[] args) {
     char[] arr = {'a','d','h','l','q','u','v'};
     char target = 'o';
     char ans = SmallestCharGreaterThanTarget(arr,target);
     System.out.println(ans);
    }
    static char SmallestCharGreaterThanTarget(char[] Arr, char Target){
        int start = 0;
        int end = Arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (Arr[mid] <= Target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return Arr[start % Arr.length];
    }
}

