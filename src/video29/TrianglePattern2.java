package video29;

public class TrianglePattern2 {
     public static void main(String[] args) {
          PrintP(4,0);
     }
     static void PrintP(int r , int c){
          // base condition 
          if(r == 0){
               return;
          }
          if(r > c){
               PrintP(r,c+1);
               System.out.print("*");
          }
          else{
               PrintP(r-1, 0);
               System.out.println(" ");
          }
     }
}
