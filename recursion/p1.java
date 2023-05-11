package recursion;

public class p1 {

  public static void main(String[] args) {
    System.out.println(print1(5););
  }

  static void print1(int n) {
    if(n==1){
System.out.println(1);
return;
    }
    System.out.println(n);
    print1(n-1);
  }
}
