class Dentaku {
  public static void main(String[] args) {
    int i1 = 0; // 初期値定義しておかないとエラーが出る
    int i2 = 0;
    String ope;

    // 引数チェック
    if (args.length != 3) {
      System.out.println("Usage : java dentaku 数値 演算子 数値");
      System.out.println("演算子は kake waru tasu hiku の4つです");
      System.exit(0);  /* プログラムを終了する */
    }

    // 入力値の格納
    try {
      i1 = Integer.valueOf(args[0]);
      i2 = Integer.valueOf(args[1]);
    }
    catch (NumberFormatException e) {
      System.out.println("第1、第2引数には整数を入力してください");
      System.exit(0);
    }

    ope = args[2];
    // 演算子の判別
    switch (ope) {
      case "kake":
        System.out.println(multiply(i1, i2));
        break;
      case "waru":
        System.out.println(divide(i1, i2));
        break;
      case "tasu":
        System.out.println(plus(i1, i2));
        break;
      case "hiku":
        System.out.println(minus(i1, i2));
        break;
      default:
        System.out.println("演算子を正しく入力してください");
        System.exit(0);
    }
  }

  private static int multiply(int i1, int i2) {
    return i1 * i2;
  }

  private static int divide(int i1, int i2) {
    return i1 / i2;
  }

  private static int plus(int i1, int i2) {
    return i1 + i2;
  }

  private static int minus(int i1, int i2) {
    return i1 - i2;
  }
}
