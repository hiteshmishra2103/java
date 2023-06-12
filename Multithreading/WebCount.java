package unit_3;

public class WebCount {

  public static void main(String[] args) {
    WebCountClass wcc = new WebCountClass();
    wcc.webCount();//count:1000

    Thread t1 = new Thread(
      new Runnable() {
        @Override
        public void run() {
          wcc.webCount();
        }
      }
    );

    Thread t2 = new Thread(
      new Runnable() {
        @Override
        public void run() {
          wcc.webCount();
        }
      }
    );

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println("Done with main thread!");
    System.out.println(WebCountClass.count);
  }
}

class WebCountClass {

  public static int count = 0;

  public synchronized void webCount() {
    for (int i = 0; i < 1000; i++) {
      count++;
    }
  }
}
