public class SubsetsOfString {

  public static void SubsetsOfString(String str, int i, StringBuilder ans) {
    if (i == str.length()) {
      if (ans.length() == 0) {
        System.out.println("null");
      } else {
        System.out.println(ans);
      }
      return;
    }

    // include the character
    ans.append(str.charAt(i));
    SubsetsOfString(str, i + 1, ans);
    ans.deleteCharAt(ans.length() - 1);

    // don't include the character
    SubsetsOfString(str, i + 1, ans);
  }

  public static void main(String[] args) {
    SubsetsOfString("abc", 0, new StringBuilder());
  }
}
