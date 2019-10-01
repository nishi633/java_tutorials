// https://www.javadrive.jp/start/linkedlist/index5.html
// キューとは先入れ先出し法（FILO)
import java.util.LinkedList;

class SampleQueue {
  public static void main(String[] args) {
    LinkedList<String> array = new LinkedList<String>();

    // リストの最後に要素追加
    array.offer("A");
    array.offer("B");
    array.offer("C");
    System.out.println(array);

    // 先頭の要素を取り出してリストから削除
    System.out.println(array.poll());
    System.out.println(array);
  }
}
