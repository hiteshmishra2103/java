package unit_3;

import java.lang.Exception;
import java.lang.Math;
import java.lang.reflect.InaccessibleObjectException;
import java.util.Scanner;

public class MultiThreadingInJava {
 
  public static void main(String[] args)throws InterruptedException {
    //		C1 o1 = new C1();
    //		C2 o2=new C2();
    //		o1.show1();
    //		o2.show1();

    Runnable1 bullet = new runnable1();
    Thread gun = new Thread(bullet);
    gun.start();

    Thread t1 = new Thread(new T1(), "T1");
    Thread t2 = new Thread(new T2(), "T2");
    Thread t3 = new Thread(new T3(), "T3");
    Thread t4 = new Thread(new T4(), "T4");

    t1.start();
    t2.start();
    t3.start();
    t4.run();

    System.out.println(Thread.currentThread().getName());
  }
}

class C1 {

  void show1() {
    for (int i = 1; i < 5; i++) {
      System.out.println(i + "-Hey_1!");
    }
  }
}

class C2 {

  void show1() {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter value of a: ");
    int a = in.nextInt();
    System.out.println("a = " + a);
    in.close();
  }
}

class T1 extends Thread {
  @Override
  public void run() {
    System.out.println("Enter in thread T1!");
      try{
        for (int i = 1; i < 5; i++) {
          System.out.println(i + "-Hey_1!");
          System.out.println(Thread.currentThread().getName());
      }
      catch(Exception e){

      }
    }

    System.out.println("Done with thread T1!");
  }
}

class T2 extends Thread {

  public void run() {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = in.nextInt();
    boolean b = true;
    for (int i = 2; i < Math.sqrt(n); i++) {
      if (n % i == 0) {
        System.out.println(n + " is not a prime number!");
        b = false;
        break;
      }
    }
    if (b == true) {
      System.out.println(n + " is a prime number!");
    }
    in.close();
  }
}

class T3 implements Runnable {

  public void run() {
    System.out.println("Enter in thread T3!");
    for (int i = 1; i < 5; i++) {
      System.out.println(i + "-Hey_3!");
      System.out.println(Thread.currentThread().getName());
    }
    System.out.println("Done with thread T3!");
  }
}

public class Runnable1 implements Runnable {

  public void run() {
    System.out.println("I am a thread not a threat!");
  }
}

class T4 extends Thread {

  public void run() {
    System.out.println("Entering in Thread T4 ");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException ie) {
      ie.printStackTrace();
    }
    for (int i = 0; i < 5; i++) {
      System.out.println(i + " Hey-4!");
    }
    System.out.println("Done with Thread T4!");
  }
}
