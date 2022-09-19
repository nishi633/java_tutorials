class ctest2 {
  public static void main(String[] args) {
    Television2 tv1 = new Television2();

    // getter/setterを使う方法(推奨)
    tv1.setChannel(1);
    tv1.dispChannel();

    // 直接指定をすると下記のエラーが出る
    /* television2.java:13: エラー: channelNoはTelevision2でprivateアクセスされます
       tv1.channelNo = 2;
          ^
tele   vision2.java:14: エラー: channelNoはTelevision2でprivateアクセスされます */
    //System.out.println(tv1.channelNo);
    //tv1.channelNo = 2;
    //System.out.println(tv1.channelNo);
  }
}

class Television2 {
  // メンバ変数
  // クラス外から値の直接指定ができないようにするためprivateをつける
  private int channelNo;

  void setChannel(int newChannelNo) {
    channelNo = newChannelNo;
  }

  void dispChannel() {
    System.out.println("現在のチャンネルは" + channelNo + "です");
  }
}
