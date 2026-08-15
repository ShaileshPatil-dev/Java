     package video21;
     public class StringPalindrome {
          // by one pointer
          public static void main(String[] args) {
               String str = "aabbbbaa";
               System.out.println(IsPalindrome(str)); }
          static boolean IsPalindrome(String str){
               if (str == null || str.length() == 0) {
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
