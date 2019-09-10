class Inc{
  static int a;
  static int b;

  public static void main(String[] args){
    // 単品で使うなら前置でも後置でも同じ
    a = 1;
    System.out.println("++a: " + ++a);
    System.out.println("a++: " + a++);

    // aに1つ足したあとにbに代入する処理
    a = 3;
    b = ++a;
    System.out.println("前置");
    System.out.println("a: " + a);
    System.out.println("b: " + b);

    // bにaを代入したあとにaに1つ足す処理
    a = 3;
    b = a++;
    System.out.println("後置");
    System.out.println("a: " + a);
    System.out.println("b: " + b);
  }
}
