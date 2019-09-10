class SampleMethod{
  public static void main(String[] args){
    // 返り値を格納するときはメソッドの代入を行ったときにだけメソッド内の処理が行われる
    String a = show();
    System.out.println("***呼び出し***");
    System.out.println(a);
    System.out.println("***呼び出し***");
    System.out.println(a);
  }

  private static String show() {
    System.out.println("メソッド内の表示");
    return "返り値";
  }
}
