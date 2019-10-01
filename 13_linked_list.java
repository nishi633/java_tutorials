// 検索はArrayListのほうが早いが、要素の追加・削除はLinkedListのほうが早い
import java.util.LinkedList;

class SampleLinkedList {
  public static void main(String[] args) {
    LinkedList<Integer> test = new LinkedList<Integer>();
    // 要素追加
    test.add(0);
    test.add(1);

    // インデックス指定して要素追加
    test.add(1, 2);
    System.out.println(test);

    // 最初に要素追加
    test.addFirst(3);
    System.out.println(test);

    // 最後に要素追加
    test.addLast(4);
    System.out.println(test);

    // 要素の取得
    System.out.println(test.get(1));

    // 要素の置き換え
    test.set(3, 22);
    System.out.println(test);

    // 要素の削除
    test.remove(3);
    System.out.println(test);

    // 要素の検索 最初の要素
    System.out.println(test.indexOf(4));

    // 要素の検索 最後の要素
    System.out.println(test.lastIndexOf(4));

    // 要素のクリア
    test.clear();
    System.out.println(test);

    // ArrayListはキューとしても使うことができる
  }
}
