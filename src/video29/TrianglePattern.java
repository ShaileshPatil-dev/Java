package video29;

public class TrianglePattern {
     public static void main(String[] args) {
          PrintP(4,0);
     }
     static void PrintP(int r , int c){
          // base condition 
          if(r == 0){
               return;
          }
          if(r > c){
               System.out.print("*");
               PrintP(r,c+1);
          }
          else{
               System.out.println(" ");
               PrintP(r-1,0);
          }
     }
}
