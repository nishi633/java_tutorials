class SampleString{
  public static void main(String[] args){
    // 文字列の作り方1: ""で囲う
    String hirekatsu = "ひれかつ";

    // 文字列の作り方2: char型の配列を使う
    char yakinikunomoto[] = {'焼', '肉'};
    String yakiniku = new String(yakinikunomoto);

    System.out.println(hirekatsu);
    System.out.println(yakiniku);

    // 指定の文字を取得
    System.out.println(hirekatsu.charAt(1));

    // 文字列の長さを取得(.lengthは配列のとき)
    System.out.println(hirekatsu.length());
  }
}
