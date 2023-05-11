public class StringPerformance {

  public static void main(String[] args) {
    // String series = "";
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < args.length; i++) {
      char ch = (char) ('a' + i);
      builder.append(ch);
    }
    System.out.println(builder.toString());

    String name = "Kunal Kushwaha";
    System.out.println(name.toCharArray());
    System.out.println(name);
    System.out.println(name.indexOf('a'));
  }
}
