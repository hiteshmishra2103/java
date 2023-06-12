package ExceptionHandling;

import java.util.Scanner;

class InputMismatch {

  void inputMismatchException() {
    try {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      System.out.println("Your number is " + n);
      in.close();
    } catch (InputMismatchException e) {
      System.out.println("Input mismatch!");
    }
  }
}

public class InputMismatchException {

  public static void main(String[] args) {
    InputMismatch obj = new InputMismatch();
    obj.inputMismatchException();
  }
}
