package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringPairAnagram {

  static boolean anagram(String str1, String str2) {
    //Convert strings to lowercase.Why? so that we don't have to check seperately for
    //lower case and upper case
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    //First check- if the lengths are the same
    if (str1.length() == str2.length()) {
      //convert strings into char array
      char[] str1charArray = str1.toCharArray();
      char[] str2charArray = str2.toCharArray();
      //sort the char array
      Arrays.sort(str1charArray);
      Arrays.sort(str2charArray);
      //if the sorted char arrays are same or identical then the strings are anagram
      boolean result = Arrays.equals(str1charArray, str2charArray);
      if (result) {
        return true;
      } else {
        return false;
      }
    } else {
      //case when the lengths are not the same
      return false;
    }
  }

  public static void main(String args[]) {
    String str1 = "earth";
    String str2 = "heart";
    anagram(str1, str2);
  }
}
