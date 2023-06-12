import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.SpringLayout;

////--------------------What will happen if you use throws but don't use try catch block
////When a method declares that it can throw a checked exception using throws,
//it is essentially indicating to the caller that the caller must handle the exception
//or propagate it further up the call stack. If the exception is not caught or propagated,
//the compiler will generate an error.

// import java.io.IOException;

// public class Main {

//     public static void main(String[] args) {
//         someMethod(); // Compiler error: Unhandled exception type IOException
//     }

//     public static void someMethod() throws IOException{
//         // Code that may throw an IOException
//     }
// }

public class task1 {

  public static void main(String[] args) throws ManualException {
    ExceptionHandling obj = new ExceptionHandling();

    // obj.basicException();
    // obj.handleException();
    // obj.multipleCatch();
    obj.inputMismatchException();
    // obj.stackOverFlowError(10);
    //obj.indexOutOfBoundExceptionPart1();
    // obj.indexOutOfBoundExceptionPart2();
    //obj.nullPointerException();
    // obj.useOfThrow(123);
    //obj.useOfThrows_And_Finally();
    //obj.checkedException();
    //obj.uncheckedException();
    //obj.manualExceptionThrow();

    int a = 100, c = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of b");
    int b = sc.nextInt();
    if (b == 5) {
      throw new ManualException();
    }
    c = a / b;
    System.out.println(c);
  }
}

class ExceptionHandling {

  void basicException() {
    //unbandled exception
    int b = 0;
    int a = 100 / b;
    System.out.println(a);
    System.out.println("Done!");
  }

  void handleException() {
    int b = 0, a;
    try {
      a = 100 / b;
      System.out.println(a);
      System.out.println("Done!");
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
      Scanner sc = new Scanner(System.in);
      System.out.println("choose non zero value");
      b = sc.nextInt(); //non-zero
      a = 100 / b;
    }
    System.out.println(a);
    System.out.println("Done");
  }

  void multipleCatch() {
    try {
      //sensitive code
      int b = 0;
      int a = 100 / b;
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage() + "hello");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  void inputMismatchException() {
    try {
      //sensitive code
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = sc.nextInt();
      System.out.println("you have entered" + num);
      sc.close();
    } catch (InputMismatchException e) {
      System.out.println("Input mismatch issue");
    }
    System.out.println("Done");
  }

  void stackOverFlowError(int m) {
    try {
      while (m > 0) {
        m++;
        stackOverFlowError(m);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    System.out.println("Done!");
  }

  void indexOutOfBoundExceptionPart1() {
    int[] num = { 1, 2, 3 };
    System.out.println(num[10]);
    System.out.println("Done!");
  }

  void indexOutOfBoundExceptionPart2() {
    try {
      int[] num = { 1, 2, 3 };
      System.out.println(num[10]);
      System.out.println("Done");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Accessing index out of bound!");
    } finally {
      System.out.println("The try catch is finished!");
    }
    System.out.println("The try catch is finished!");
  }

  void nullPointerException() {
    try {
      String s = null;
      System.out.println(s.length());
    } catch (NullPointerException e) {
      System.out.println(e.getMessage());
    }
    System.out.println("Done");
  }

  void useOfThrow(int m) {}

  void usOfThrows_And_Finally() {}

  void checkedException() {}

  void uncheckedException() {
    int b = 0;
    int a = 100 / b;
    System.out.println(a);
    System.out.println("Done!");
  }

  void manualExceptionThrow() {}

  void illegalArgumentException() {}
}

class ManualException extends Exception {

  @Override
  public String getMessage() {
    String detailMessage = "Manual Exception occured!";
    return detailMessage;
  }
}
