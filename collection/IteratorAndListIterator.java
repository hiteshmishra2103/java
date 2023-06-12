package collection;

import java.util.Iterator;
import java.util.List;

public class IteratorAndListIterator {

  public static void main(String[] args) {}

  static void iterator() {
    System.out.println("#######Iterator########");
    List<Integer> list = new ArrayList<>();
    list.add(1);

    Iterator<Integer> i = list.iterator();

    ////Interviews::-> //Why we don't see an error "index out of bounds error"
    while (i.hasNext()) {
      System.out.println(i.next());
    }

    i.remove();
    i = list.iterator();
  }
}
