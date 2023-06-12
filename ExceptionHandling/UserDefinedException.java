package ExceptionHandling;

public class UserDefinedException {

  public static void main(String[] args) {
    int i = 5;
    try {
      if (i > 10) {
        try {
          throw new MyException();
        } catch (MyException e) {
          System.out.println(e);
        }
      }
      if (i < 10) {
        throw new Exception("errorororor");
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

class MyException extends Exception {

  @Override
  public String toString() {
    return "This is toString()";
  }

  @Override
  public string getMessage() {
    return "This is getMessage()";
  }
}
