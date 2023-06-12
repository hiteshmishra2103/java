package Arraylist;
import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Arraylist {

  public static void main(String[] args) {
    //operations

    //create an array list
    Arraylist<Integer> list = new ArrayList<Integer>();
    Arraylist<Boolean> a = new Arraylist<>();
    ArrayList<Character> b = new Arraylist<>();

    //add element: o(1)
    list.add(0);
    list.add(1);
    list.add(2);
    list.add(3);

    list.add(2, 9); //O(n)

    //get element: O(1)
    int firstelement = list.get(0);
    System.out.println(firstelement);

    //delete element: O(n):because first we will
    //search for the element and then delete that element
    list.remove(1);
    System.out.println(list);

    //Set element at index: O(n)
    list.set(2, 10);
    System.out.println(list);
    //check if element is present in the arraylist
    System.out.println(list.contains(11)); //will print false, bcz element not present

    //accesing arraylist values
    list.get(0);
  }
}
