package video21;

public class StringPalindrome2 {
     // by two pointer 
     public static void main(String[] args) {
          String str = "aabbbbaa";
          System.out.println(isPalindrome(str));
}
static boolean isPalindrome(String str) {
    int i = 0;
    int j = str.length() - 1;

    while (i < j) {
        if (str.charAt(i) != str.charAt(j)) {
            return false;
        } else {
            i++;
            j--;
        }
    }

    return true;
}
}