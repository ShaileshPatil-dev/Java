package video21;
public class StringPalindrome {
     public static void main(String[] args) {
          String str = "aabbbbaa";
          System.out.println(Ispalindrome(str));
     }
     static boolean Ispalindrome(String str){
          if (str.length()==0|| str == null) {
               return false;
          }
          for (int i = 0; i < str.length(); i++) {
               char start = str.charAt(i);
               char end= str.charAt(str.length()-i-1);
               if (start!=end) {
                    return false;
               }
          }
          return true;
     }
}
