package video13;

public class test2 {
     public static void main(String[] args) {
          String str = "Shailesh Patil";
          char target = 's';
          System.out.println(Search(str , target));

     }
     static boolean Search(String name , char goal){
          if (name.length() == 0) {
               return false;
          }
          for (int i = 0; i < name.length(); i++) {
               if (goal == name.charAt(i)) {
                    return true;
               }
          }
          return false;
     }
}
