class SampleTry {
  public static void main(String[] args) {
    int data[] = { 1, 2, 3 };
    try {
        // 例外の発生をチェックする処理
      for (int i = 0; i < 4; i++) {
        System.out.println(data[i]);
      }
    }
    catch (ArrayIndexOutOfBoundsException e) {
      // 範囲外エラー
      System.out.println("範囲を超えています");
    }
    finally {
      System.out.println("例外があってもなくても実行します");
    }
    // catchの中でreturnなど使われるとこれは実行されないがfinallyの処理は実行される
    System.out.println("完了");
  }
}
