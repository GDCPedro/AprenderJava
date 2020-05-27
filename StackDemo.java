import java.util.*;

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