package video23;

public class test3 {
     // see in below approch if the 500 numbers prints so will you write it till 500 time 
     public static void main(String[] args) {
          // Write a function that takes number and prints it and print first 5 numbers using only one function 
          
          Print1(1);
          // PrintN(2);
          // PrintN(3);
          // PrintN(4);
          // PrintN(5);
     }
     static void Print1(int n){
          System.out.println(n);
          Print2(2);
     }
     static void Print2(int n){
          System.out.println(n);
          Print3(3);
     }
     static void Print3(int n){
          System.out.println(n);
          Print4(4);
     }
     static void Print4(int n){
          System.out.println(n);
          Print5(5);
     }
     static void Print5(int n){
          System.out.println(n);
     }
}
