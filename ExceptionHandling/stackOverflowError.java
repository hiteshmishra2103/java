public class stackOverFlowError {

  public static void main(String[] args) {
    stackOverflow obj = new stackOverflow();
    obj.stackOverFlowError(0);
  }
}

class stackOverflow {

  void stackOverFlowError(int m) {
    try {
      m++;
      stackOverFlowError(m);
    } catch (StackOverflowError e) {
      System.out.println(e.toString());
    }
  }
}
