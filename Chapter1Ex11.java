// CS210 Chapter1Ex11
// Ming Ho / Chiang


public class Chapter1Ex11 {
   public static void main(String[] args) {
      top(); 
      box();
      middle();
      box();
      top();
   }
   public static void top() {
      System.out.println("   /\\       /\\ ");
      System.out.println("  /  \\     /  \\");
      System.out.println(" /    \\   /    \\");
   }
   public static void box() {
      System.out.println("+------+ +------+");
      System.out.println("|      | |      |");
      System.out.println("|      | |      |");
      System.out.println("+------+ +------+");
   }
   public static void middle() {
      System.out.println("|United| |United|");
      System.out.println("|States| |States|");
   }
}