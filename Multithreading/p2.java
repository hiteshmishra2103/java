package Multithreading;

import java.util.Scanner;

//Suppose we have 50 lines of code in our method, but we want to synchronize only 5

class WebCount {

  public static int count = 0;

  //What is synchronised method?
  //What is race condition?
  //how to prevent race condition in thread?
  //what is synchronized in java and why we use it?


  //If not synchronized then, t1 and t2 may read the same value of count at the same time and may increment same time as well
  // Both the thread may resume, in that case the value of count may be same for different iterations.

  public synchronized void webcount() {
    count++;
  }
}

public class WebCountInJava {

  public static void main(String[] args) {
    WebCount obj = new WebCount();

    Thread t1 = new Thread(
      new Runnable() {
        public void run() {
          for (int i = 1; i < 1000; i++) {
            obj.webcount();
          }
        }
      }
    );

    Thread t2 = new Thread(
      new Runnable() {
        public void run() {
          for (int i = 1; i < 1000; i++) {
            obj.webcount();
          }
        }
      }
    );

    t1.start();
    t2.start();
    System.out.println("Done with t1 and t2!");
    System.out.println("Count: " + WebCount.count);
  }
}
