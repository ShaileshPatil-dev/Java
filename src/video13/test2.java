package video13;

public class test2 {
     public static void main(String[] args) {
          String str = "cyguguydduyfddkyt56e5esftviuubggx5 uyt7td6rvuyfvuvrtrrasyetrsukdcuatrs";
          char target = 'y';
          System.out.println(Search(str, target));

     }

     static boolean Search(String name, char goal) {
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
