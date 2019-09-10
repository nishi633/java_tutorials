class SampleArray{

  public static void main(String[] args) {
    // 配列の定義
    // newを使うことによってクラス名から定義
    int a[] = new int[5];
    System.out.println(a[4]);

    a[4] = 44;
    System.out.println(a[4]);

    // 初期値を指定して定義
    int b[] = {00, 11, 22, 33, 44 };
    System.out.println(b[1]);
    System.out.println(b.length);

    // 定義以上の要素数を指定するとエラー
    //b[5] = 55;
    //System.out.println(b[5]);
  }
}
