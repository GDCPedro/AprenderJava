public class FunctionsDemo {
  public static void main(String[] args) {
    System.out.println(max(22, 33));

    System.out.println(max(3.1431, 3.13));
  }

  /**
   * 一个类的两个方法拥有相同的名字，但是有不同的参数列表。 Java编译器根据方法签名判断哪个方法应该被调用。
   * 方法重载可以让程序更清晰易读。执行密切相关任务的方法应该使用相同的名字。
   * 重载的方法必须拥有不同的参数列表。你不能仅仅依据修饰符或者返回类型的不同来重载方法。
   */

  private final static int max(int num1, int num2) {
    return num1 >= num2 ? num1 : num2;
  }

  private final static double max(double num1, double num2) {
    return num1 >= num2 ? num1 : num2;
  }
}