public class RemoveDuplicateString {

  public static void removeDuplicates(
    String str,
    int indx,
    StringBuilder newStr,
    boolean map[]
  ) {
    if (indx == str.length()) {
      System.out.println(newStr);
      return;
    }
    char currChar = str.charAt(indx);
    if (map[currChar - 'a'] == true) {
      //duplicate found
      removeDuplicates(str, indx + 1, newStr, map);
    } else {
      map[currChar - 'a'] = true;
      //add it to new string
      newStr.append(currChar);
      removeDuplicates(str, indx + 1, newStr, map);
    }
  }

  public static void main(String[] args) {
    String str = "apnacollege";
    boolean map[] = new boolean[26];

    removeDuplicates(str, 0, new StringBuilder(""), map);
  }
}
