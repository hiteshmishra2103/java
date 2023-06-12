package Multithreading;

import java.util.Scanner;

public class p1 {}

//creating my own thread: By extending the thread class
class t11 extends Thread {
@override
  public void run() {
    Scanner obj = new Scanner(System.in);
    System.out.println("enter the vaue of a: ");
    int a = obj.nextInt();
    System.out.println(a);
    System.out.println("Done with show1()");
    obj.close();
    System.out.println(Thread.currentThread().getName());//it will print the thread which runs this line
  }
}

class t22 extends Thread {

  Thread t1 = new Thread(new T1(),"t1 thread");
  Thread t2 = new Thread(new T2(), "t2 thread");

  //jvm will decide which will execute first, it does not depend on the flow of program
  // t1.start();
  // t2.start();
  //When you use start, then new thread is created
  t1.run;
  t2.run;//no new thread will be created, when we use run
  
  ////------------------------------what is context switch?------------------------------------------

  //simulatenous execution: ek time pe ek hi 

  //parallel v/s simultaneous execution


  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println(i + "- Hey_2!");
    }
  }
  
  try{
    Thread.sleep(10000);
    System.out.println("Done with wait");
  }catch(InterruptedException){
    //Todo auto-generated catch block
    e.printStackTrace();
  }
}
