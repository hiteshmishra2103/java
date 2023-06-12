package ExceptionHandling;

class nullPointerException {

  static void npe() {
    try {
      Object obj = null;
      System.out.println(obj.toString());
    } catch (NullPointerException e) {
      System.out.println(e.toString());
    }
  }
}

public class NullPointerException {

  public static void main(String[] args) {
    nullPointerException.npe();
  }
}
