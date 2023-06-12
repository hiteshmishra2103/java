package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindMax {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a;
    int max = Integer.MIN_VALUE;
    ArrayList<Integer> arr = new ArrayList<>(10);
    System.out.println("Enter the items: ");
    for (int i = 0; i < arr.size(); i++) {
      a = sc.nextInt();
      arr.add(a);
    }

    //Sorted list
    //Ascending order
    System.out.println("sorted list is: " + Collections.sort(arr));
    //Descending order
    System.out.println(
      "Descending order: " + Collections.sort(arr, Collections.reverseOrder())
    );
    //comparator - fnx logic
    

    for (Integer it : arr) {
      if (it > max) {
        max = it;
      }
    }
    System.out.println(max);
  }
}
