package video21;

public class Alphabet {
     public static void main(String[] args) {
          // print the string from a to z and A to Z
          String atoz = "";

          for (int i = 0; i < 26; i++) {
               char ch = (char) ('a' + i);
               atoz += ch + " ";
          }

          System.out.println(atoz);
          System.out.println(atoz.toUpperCase());
     }
}
// pros : our output is correct
// cons : each time we are creating new string like
/*
 * for i = 1 --------> atoz pointing to "a"
 * for i = 2 --------> atoz pointing to "ab"
 * for i = 3 --------> atoz pointing to "abc"
 * for i = 4 --------> atoz pointing to "abcd"
 * for i = 5 --------> atoz pointing to "abcde"
 * for i = 6 --------> atoz pointing to "abcdef"
 * 
 * means as we are adding the char to string ; because string is immutable(can't
 * update); it is creatign new string for each i and hence it is not optimized
 */