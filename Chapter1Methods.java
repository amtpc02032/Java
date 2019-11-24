// CS210 Assignment 1 (Methods)
// Ming Ho / Chiang


public class Chapter1Methods {

   public static void first() {
      System.out.println("Inside first method");
      third();
     
   }
 
   public static void second() {
      System.out.println("Inside second method");
      
   }
 
   public static void third() {
      System.out.println("Inside third method");
      second();
   } 
 
   public static void main(String[] args) {
    // DO NOT change this part
      first();
      third();
      second();
      third();
   }
}