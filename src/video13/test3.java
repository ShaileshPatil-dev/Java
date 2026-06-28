package video13;

public class test3 {
     public static void main(String[] args) {
          String str = "Shailesh Patil";
          char ch = 'i';
          int start = 2;  
          int end = 5;
          System.out.println(Search(str , ch , start , end));

     }
     static boolean Search (String name , char goal , int start , int end){
          if (name.length()==0) {
               return false;
          }
          for (int i = start; i < end; i++) {
               if (goal == name.charAt(i)) {
                    return true;
               }
          }
          return false;
     }
}
