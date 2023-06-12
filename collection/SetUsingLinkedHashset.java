package collection;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * No duplicates
 * at most one null element
 *
 * {LinkedHashset}
 * Inside, It uses doubly-linked list internally
 * Preserve insertion order
 */

public class SetUsingLinkedHashset {

  public static void main(String[] args) {
    //Set demonstration using Hashset
    Set<String> hash_set = new LinkedHashSet<String>();

    hash_set.add("Sumit");
    hash_set.add("Chauhan");
    hash_set.add("Hitesh");
    hash_set.add("Mishra");
    hash_set.add("Sumit");
    hash_set.add("Singh");
    hash_set.add("Set");

    hash_set.add(null);
    hash_set.add(null); // It would not make sense, as at most one

    // System.out.println("Set output without the duplicates!");

    System.out.println(hash_set);

    //Remove null value from the set
    hash_set.remove(null);
    
    //Why we don't use index values in set for removing values in the set
    hash_set.remove("Set");

    // System.out.println("Set output after nulll is removed!");
    System.out.println(hash_set);
  }
}
