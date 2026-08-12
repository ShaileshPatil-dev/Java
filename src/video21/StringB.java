package video21;

public class StringB {
     public static void main(String[] args) {
          StringBuilder builder = new StringBuilder();
          for (int i = 0; i < 26; i++) {
               char ch = (char) ('a' + i);
               builder.append(ch + " ");
          }
          System.out.println(builder.toString());
          System.out.println(builder.toString().toUpperCase());
     }
}
/*
Why Stringbuilder ? --------> So the stringbuilder is a class that can be add the string values and convert it into the string 

*/