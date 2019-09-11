import java.io.File;
import java.io.IOException;

class SampleFile {
  public static void main(String[] args) {
    File file = new File("sampleb.txt");
    if (file.isFile()) {
      // 絶対パス取得
      String path = file.getAbsolutePath();
      System.out.println("ファイルあった (" + path + ")");

      try{
        FileReader filereader = new FileReader(file);
      }catch(FileNotFoundException e){
        System.out.println(e);
      }
    } else if (file.isDirectory()) {
      System.out.println("ディレクトリだよ");
    } else if (!file.exists()) {
      // なかったら作る
      try {
        file.createNewFile();
      }
      catch (IOException e) {
        System.out.println(e);
      }
      System.out.println("ないから作った");
    }
  }
}
