package unit_3;

class CustomThreadStartOrRun implements Runnable {

  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println(Thread.currentThread().getName() + "=" + i);
    }
  }
}

public class RunorStart {

  public static void main(String[] args) {
    Thread threadone = new Thread(new CustomThreadStartOrRun(), "Thread 1");
    Thread threadtwo = new Thread(new CustomThreadStartOrRun(), "Thread 2");
    threadone.start();
    threadtwo.run();
    System.out.println(Thread.currentThread().getName());
  }
}
/*
 *When we calls start method, then separate call stack will be created for that particular method
 *When we call run method directly ,then it will be stored in current stack [usually in main method stack]
 *We should not call run method directly,let the JVM execute run() method through start()  method by creating separate call stack
 *Otherwise it will behave as a simple current thread method
 */
