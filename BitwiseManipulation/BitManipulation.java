public class BitManipulation {

  public static void oddOrEven(int n) {
    int bitMask = 1;
    if ((n & bitMask) == 0) {
      System.out.println("Even Number!");
    } else {
      System.out.println("Odd number!");
    }
  }

  ///--------------------------------------OR--------------------------//
  // public static void oddOrEven(int n) {
  //   if (n & 1){
  //     System.out.println("Odd number!");
  //   } else {
  //     System.out.println("Even Number!");
  //   }
  // }

  public static int getIthBit(int n, int i) {
    int bitMask = 1 << i;
    if ((n & bitMask) == 0) {
      return 0;
    } else {
      return 1;
    }
  }

  public static int clearIthBits(int n, int i) {
    int bitMask = ~(0);
    return n & bitMask;
  }

  public static int clearIthBit(int n, int i) {
    int bitMask = ~(1 << i);
    return n & bitMask;
  }

  public static int setIthBit(int n, int i) {
    int bitMask = 1 << i;
    return n | bitMask;
  }

  public static int clearIthBit(int n, int i) {
    int bitMask = 1 << i;
    return n & (~bitMask);
  }

  public static int clearBitsInRange(int n, int i, int j) {
    int a = ((~0) << (j + 1));
    int b = (1 << i) - 1;
    int bitMask = a | b;
    return n & bitMask;
  }

  public static int updateIthBit(int n, int i, int newBit) {
    // if (newBit == 0) {
    //   return clearIthBit(n, newBit);
    // } else {
    //   setIthBit(n, newBit);
    // }

    //when we have to clear the bit then newBit will be 0 else newBit will be 1
    n = clearIthBit(n, i);
    int bitMask = newBit << i;
    return n | bitMask;
  }

  public static void main(String[] args) {
    oddOrEven(11);
    oddOrEven(10);
    System.out.println(getIthBit(10, 2));
    System.out.println(setIthBit(12, 2));
    System.out.println(clearIthBit(12, 1));
    System.out.println(updateIthBit(10, 2, 1));
    System.out.println(clearIthBit(15, 2));
  }
}
