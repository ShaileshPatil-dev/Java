package video23;
public class test2 {
     /*
     see below for noob approch 1 : what if there is to print hello world for 200 times what we will do ? will we call 200 functions ...Hell Nah bro 
     see below for noob approch 2 : what if we cant modify the function ....again hell nah bro
     see below for noob approch 3 : calling 4 other function that do same work (prints hw) 
     see below for noob approch 4 : Using loop 
     */
     public static void main(String[] args) {
          // Q: Write a function to print Hello World ! for 5 times by only one function

          // Noob approch 1
          // PrintHW(); 
          // PrintHW(); 
          // PrintHW(); 
          // PrintHW(); 
          // PrintHW(); 

          // Another noob approch 4:
          for (int i = 0; i < 5; i++) {
               PrintHW();
          }
          
     }
     static void PrintHW(){
          System.out.println("Hello World !");

          // Another noob approch 2
          // System.out.println("Hello World !");
          // System.out.println("Hello World !");
          // System.out.println("Hello World !");
          // System.out.println("Hello World !");
          // System.out.println("Hello World !");

          // another super noob approch 3
          // PrintHW1();
     }
     static void PrintHW1(){
          System.out.println("Hello World !");
          PrintHW2();
     }
     static void PrintHW2(){
          System.out.println("Hello World !");
          PrintHW3();
     }
     static void PrintHW3(){
          System.out.println("Hello World !");
          PrintHW4();
     }
     static void PrintHW4(){
          System.out.println("Hello World !");
     }
}
