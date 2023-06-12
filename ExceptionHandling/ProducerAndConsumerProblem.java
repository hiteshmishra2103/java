package ExceptionHandling;

import java.util.LinkedList;
import java.util.Queue;
import java.util.random;

//When to use synchronized block and when to use synchronized ?

//

public class ProducerAndConsumerProblem {

  public static void main(String[] args) {
    Queue<Integer> buffer = new LinkedList<>();
    int maxSize = 10;
    Thread producer = new Producer(buffer, maxSize, "PRODUCER");
    Thread consumer = new Consumer(buffer, maxSize, "CONSUMER");
    producer.start();
    consumer.start();
  }
}

//notifyAll: if you have multiple thread: ek thread multiple thread ko invoke kr paye

class Producer extends Thread {

  private Queue<Integer> buffer;
}
//Question: What is interthread communication?
//How JVM will execute multiple threads
//When to use wait(), notify(), notifyAll()
//one way communication: deposit and withdrawal⭐
//Two way communication:Explain Producer and consumer
//Unit 03 ends

