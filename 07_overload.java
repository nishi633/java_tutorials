class SampleOverLoad {
  public static void main(String[] args) {
    System.out.println(plus(1, 2));
    System.out.println(plus(1.0, 2.0));

    System.out.println(plus(1, 2, 3, 4));
  }

  private static int plus(int a, int b) {
     return a + b;
  }

  private static double plus(double a, double b) {
     return a + b;
  }

  // 可変長引数
  private static int plus(int... input) {
    int result = 0;
    for (int i = 0; i < input.length; i++) {
      result = result + input[i];
    }
    return result;
  }
}
