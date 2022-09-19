// 実行用のメインクラス
class ctest1 {
  // staticはプログラム開始時に用意して置かなければいけないメソッドにつける
  // mainメソッドを主軸にプログラムが動くのでこれは必ずstatic
  public static void main(String[] args) {
    Television tv1 = new Television();

    // getter/setterを使う方法(推奨)
    tv1.setChannel(1);
    tv1.dispChannel();

    // 直接指定
    tv1.channelNo = 2;
    System.out.println(tv1.channelNo);
  }
}

class Television {
  // メンバ変数
  int channelNo;

  // メンバメソッド
  // オブジェクトが生成されてから用意されればいいメソッドはstaticをつけない
  void setChannel(int newChannelNo) {
    // メソッドを通して値をセットすることでバリデーションなども可能なため、直接定義よりメソッドを使って設定する方法を推奨
    channelNo = newChannelNo;
  }

  void dispChannel() {
    System.out.println("現在のチャンネルは" + channelNo + "です");
  }
}
