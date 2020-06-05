import java.util.*;

/**
 * 栈是Vector的一个子类，它实现了一个标准的后进先出的栈。
 * boolean empty() 测试堆栈是否为空
 * Object peek() 查看堆栈顶部的对象 但不从堆栈中移出它
 * Object pop( ) 移除堆栈顶部的对象，并作为此函数的值返回该对象]
 * Object push(Object element) 把项压入堆栈顶部
 * int search(Object element) 返回对象在堆栈中的位置 以1为基数
 */

public class StackDemo {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<Integer>();

    System.out.println("satck: " + st);

    showpush(st, 1);
    showpush(st, 2);
    showpush(st, 3);

    showpop(st);
    showpop(st);
    showpop(st);

    try {
      showpop(st);
    } catch (EmptyStackException e) {
      // TODO: handle exception
      System.err.println("Empty");
      System.err.println(e);
    }
  }

  static void showpush(Stack<Integer> st, int a) {
    st.push(a);

    System.out.println("push (" + a + ")");
    System.out.println("stack: " + st);
  }

  static void showpop(Stack<Integer> st) {
    System.out.print("pop -> ");

    Integer a = (Integer) st.pop();

    System.out.println(a);
    System.out.println("stack: " + st);
  }
}