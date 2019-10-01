import java.util.HashMap;


class SampleHashMap {
  public static void main(String[] args) {
    HashMap<String,String> map = new HashMap<String,String>();

    // 要素の追加
    map.put("apple", "りんご");
    map.put("banana", "ばなな");
    map.put("grape", "ぶどう");
    System.out.println(map);

    // 要素取得
    System.out.println(map.get("apple"));

    // キーの存在チェック
    if (!map.containsKey("a")) {
      System.out.println("[error] aの要素はないよ");
    }

    // 要素の削除
    map.remove("apple");
    System.out.println(map);

    // 全要素の削除
    map.clear();
    System.out.println(map);
  }
}
