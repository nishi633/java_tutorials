import java.util.ArrayList;

// ArrayListクラスはサイズの決まっていない配列
class SampleArrayList {
  public static void main(String[] args) {
    // 初期容量10で初期化される
    // <>の内側には型クラス名
    ArrayList<String> test = new ArrayList<String>();

    // 要素の追加
    test.add("a");
    test.add("b");
    test.add("c");
    test.add("d");
    test.add("c");
    test.add("c");
    System.out.println(test);

    // 要素の取得
    System.out.println(test.get(1));

    // 要素数の取得
    System.out.println(test.size());

    // 要素の置き換え
    test.set(1, "bbb");
    System.out.println(test);

    // 要素の削除
    test.remove(0);
    System.out.println(test);

    // 要素の検索 最初のインデックス取得
    System.out.println(test.indexOf("c"));
    System.out.println(test.indexOf("aa")); // 該当要素がないと-1

    // 要素の検索 最後のインデックス取得
    System.out.println(test.indexOf("c"));
    System.out.println(test.lastIndexOf("c"));

    // 要素のクリア
    test.clear();
    System.out.println(test);
  }
}
