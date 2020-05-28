import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamFileIO {
  /**
   * Java.io 包几乎包含了所有操作输入、输出需要的类。所有这些流类代表了输入源和输出目标。 Java.io
   * 包中的流支持很多种格式，比如：基本类型、对象、本地化字符集等等。 一个流可以理解为一个数据的序列。
   * 输入流表示从一个源读取数据，输出流表示向一个目标写数据。 Java 为 I/O 提供了强大的而灵活的支持，使其更广泛地应用到文件传输和网络编程中。
   */

  public static void main(String[] args) throws FileNotFoundException {
    startReadFile();
  }

  static void startRead() throws IOException {
    char c;
    // 使用System.in创建BufferedReader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("输入字符, 按下 'q' 键退出。");

    do {
      c = (char) br.read();
    } while (c != 'q');
  }

  static void startReadLine() throws IOException {
    String str;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter lines of text.");
    System.out.println("Enter 'end' to quit.");

    do {
      str = br.readLine();
      System.out.println(str);
    } while (!str.equals("end"));
  }

  static void startReadFile() throws FileNotFoundException {
    /**
     * FileInputStream 该流用于从文件读取数据，它的对象可以用关键字 new 来创建。 有多种构造方法可用来创建对象。
     * 可以使用字符串类型的文件名来创建一个输入流对象来读取文件：
     */
    // InputStream f = new FileInputStream(file)
    File f = new File("./helloFile.txt");
    InputStream out = new FileInputStream(f);

    System.out.println(out);

    /**
     * 1 public void close() throws IOException{}
     * 关闭此文件输入流并释放与此流有关的所有系统资源。抛出IOException异常。 2 protected void finalize()throws
     * IOException {} 这个方法清除与该文件的连接。确保在不再引用文件输入流时调用其 close 方法。抛出IOException异常。 3
     * public int read(int r)throws IOException{} 这个方法从 InputStream
     * 对象读取指定字节的数据。返回为整数值。返回下一字节数据，如果已经到结尾则返回-1。 4 public int read(byte[] r) throws
     * IOException{} 这个方法从输入流读取r.length长度的字节。返回读取的字节数。如果是文件结尾则返回-1。 5 public int
     * available() throws IOException{} 返回下一次对此输入流调用的方法可以不受阻塞地从此输入流读取的字节数。返回一个整数值。
     */
    System.out.println(f.canRead());
    try {
      System.out.println(out.read());
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}