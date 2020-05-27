public class FunctionsDemo {
  public static void main(String[] args) {
    System.out.println(max(22, 33));
  }

  private final static int max(int num1, int num2) {
    return num1 >= num2 ? num1 : num2;
  }
}