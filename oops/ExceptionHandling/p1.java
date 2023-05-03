import java.util.Scanner;

public class p1 {

  public static void main(String[] args) {
    indexOfBoundExceptionPart2();
  }

  static void indexOfBoundExceptionPart2() {
    try {
      int[] myNumbers = { 1, 2, 3 };
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      //The finally statement lets you execsute code, after try... catch regardless of the results
      System.out.println("The 'try catch' block is finished!");
    }

    System.out.println("The 'try catch' is finished.");
  }
}
