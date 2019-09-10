// 四則演算するクラス
class Calc{
  // 計算対象や計算結果のデータは「フィールド」と呼ぶ
  static int result;
  char name = "calculator class"

  // データ処理の機能は「メソッド」と呼ぶ
  // メソッドは「修飾子 返り値の型 メソッド名(引数){}」 で作られる
  public static void main(String[] args){
    plus(2,3);
    System.out.println(result);
    System.out.println(dob(5));
  }

  // plus 引数を足し合わせる
  static void plus(int val1, int val2) {
    result = val1 + val2;
  }

  // dob 引数を2倍にする
  public static int dob(int input){
      return input * two();
  }

  // two 常に2を返すメソッド
  private static int two(){
      return 2;
  }
}
